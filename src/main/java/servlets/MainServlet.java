package servlets;

import dao.ClientDaoImpl;
import entity.Client;
import parser.Rates;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = PasswordService.getInstance().encrypt(request.getParameter("password"));
        ClientDaoImpl clientDao = new ClientDaoImpl();
        try {
            Client client = clientDao.getByEmail(email);

            if (client.getPassword().equals(password)) {
                Cookie cookie = new Cookie("email", email);
                cookie.setMaxAge(60 * 60);
                response.addCookie(cookie);
                response.sendRedirect("/login");
            } else {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
                PrintWriter out = response.getWriter();
                out.println("<font color=red>Either user name or password is wrong.</font>");
                rd.include(request, response);
            }

            clientDao.destroy();

        } catch (IndexOutOfBoundsException e) {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/info.jsp");
            String message = "No email found. Please register.";
            request.setAttribute("message", message);
            rd.forward(request, response);
        }

    }

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        config.getServletContext().setAttribute("USD", Rates.USD.getRate());
        config.getServletContext().setAttribute("EUR", Rates.EUR.getRate());
        config.getServletContext().setAttribute("RUB", Rates.RUB.getRate());
    }
}
