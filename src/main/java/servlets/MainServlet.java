package servlets;

import dao.ClientDaoImpl;
import entity.Client;
import org.hibernate.exception.JDBCConnectionException;
import parser.Parser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = (String) request.getParameter("email");
        String password = (String) request.getParameter("password");

        ClientDaoImpl i = new ClientDaoImpl();
        Client client = i.getByEmail(email);

        try {
            if (client.getPassword().equals(password)) {
                RequestDispatcher view = getServletContext().getRequestDispatcher("/profile.jsp");
                request.getSession().setAttribute("client", client);
                view.forward(request, response);
            } else {


            }
        } catch (JDBCConnectionException e) {
            i.destroy();
            doPost(request, response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String test = "testtest123";
        request.getSession().setAttribute("test", test);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
        rd.include(request, response);
        rd.forward(request, response);
    }
}
