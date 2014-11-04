package servlets;

import dao.AccountDaoImpl;
import dao.ClientDaoImpl;
import entity.Account;
import entity.Client;
import entity.Transaction;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SendServlet extends HttpServlet {
    String email;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();

        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("email")) {
             email = cookie.getValue();
            }
        }

        String amount = request.getParameter("amount");
        String currency = request.getParameter("currency");

        ClientDaoImpl clientDao = new ClientDaoImpl();
        Client sender = clientDao.getByEmail(email);

        Transaction transaction = new Transaction(sender, sender, currency, amount, currency);

        AccountDaoImpl accountDao = new AccountDaoImpl();
        Account UAH = accountDao.getByCurrency(sender, "UAH");
        Account USD = accountDao.getByCurrency(sender, "USD");
        Account EUR = accountDao.getByCurrency(sender, "EUR");
        Account RUB = accountDao.getByCurrency(sender, "RUB");
        request.setAttribute("accountUAH", UAH);
        request.setAttribute("accountUSD", USD);
        request.setAttribute("accountEUR", EUR);
        request.setAttribute("accountRUB", RUB);

        //request.getRequestDispatcher("/WEB-INF/profile.jsp").include(request, response);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/profile.jsp");
        rd.forward(request, response);

//        request.setAttribute("transaction", transaction);
//
//        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/sent.jsp");
//        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClientDaoImpl clientDao = new ClientDaoImpl();

        Client sender = clientDao.getByEmail(request.getParameter("senderEmail"));
        Client receiver = clientDao.getByEmail(request.getParameter("receiverEmail"));

        String senderCurrency = request.getParameter("senderCurrency");
        String amount = request.getParameter("amount");
        String receiverCurrency = request.getParameter("receiverCurrency");

        Transaction transaction = new Transaction(sender, receiver, senderCurrency, amount, receiverCurrency);
        request.setAttribute("transaction", transaction);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/sent.jsp");
        rd.forward(request, response);

    }
}
