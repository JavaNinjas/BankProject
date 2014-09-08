package servlets;

import parser.Rates;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        RequestDispatcher view = getServletContext().getRequestDispatcher("/login");
        request.setAttribute(email, "email");
        request.setAttribute(password, "password");
        view.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        config.getServletContext().setAttribute("USD", Rates.USD.getRate());
        config.getServletContext().setAttribute("EUR", Rates.EUR.getRate());
        config.getServletContext().setAttribute("RUB", Rates.RUB.getRate());
    }
}
