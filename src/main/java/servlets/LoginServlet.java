package servlets;

import dao.ClientDaoImpl;
import entity.Client;
import org.hibernate.exception.JDBCConnectionException;
import parser.Parser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        ClientDaoImpl i = new ClientDaoImpl();
        Client client = i.getByEmail(email);

        try {
            if (client.getPassword().equals(password)) {

                Cookie emailCookie = new Cookie(email, "email");
                Cookie passwordCookie = new Cookie(password, "password");

                emailCookie.setMaxAge(60*60);
                passwordCookie.setMaxAge(60*60);
                response.addCookie(emailCookie);
                response.addCookie(passwordCookie);

                RequestDispatcher view = getServletContext().getRequestDispatcher("/profile");
                request.getSession().setAttribute("client", client);
                view.forward(request, response);

            } else {

                RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
                PrintWriter out= response.getWriter();
                out.println("<font color=red>Either user name or password is wrong.</font>");
                rd.include(request, response);

            }
        } catch (JDBCConnectionException e) {
            i.destroy();
            doPost(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
