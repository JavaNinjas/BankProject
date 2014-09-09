package servlets;

import dao.AccountDaoImpl;
import dao.ClientDaoImpl;
import entity.Account;
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

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClientDaoImpl clientDao = new ClientDaoImpl();
        Cookie[] cookies = request.getCookies();

        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("email")) {
                String email = cookie.getValue();

                Client client = clientDao.getByEmail(email);
                request.setAttribute("client", client);

                AccountDaoImpl accountDao = new AccountDaoImpl();
                Account UAH = accountDao.getByCurrency(client, "UAH");
                Account USD = accountDao.getByCurrency(client, "USD");
                Account EUR = accountDao.getByCurrency(client, "EUR");
                Account RUB = accountDao.getByCurrency(client, "RUB");
                request.setAttribute("accountUAH", UAH);
                request.setAttribute("accountUSD", USD);
                request.setAttribute("accountEUR", EUR);
                request.setAttribute("accountRUB", RUB);

                RequestDispatcher view = getServletContext().getRequestDispatcher("/WEB-INF/profile.jsp");
                view.forward(request, response);
            }
        }
    }
}
