package servlets;

import dao.ClientDaoImpl;
import dao.TransactionDaoImpl;
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
import java.util.List;

public class TransactionsServlet extends HttpServlet {
    String email;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClientDaoImpl clientDao = new ClientDaoImpl();
        Cookie[] cookies = request.getCookies();

        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("email")) {
                email = cookie.getValue();
            }
        }

        Client client = clientDao.getByEmail(email);
        request.setAttribute("client", client);

        clientDao.destroy();

        TransactionDaoImpl transactionDao = new TransactionDaoImpl();
        List<Transaction> transactions = transactionDao.getByClient(client);
        request.setAttribute("client", client);
        request.setAttribute("transactions", transactions);

        transactionDao.destroy();

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/show.jsp");
        rd.forward(request, response);
    }
}
