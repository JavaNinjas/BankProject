package servlets;
import dao.AccountDaoImpl;
import dao.ClientDaoImpl;
import entity.Account;
import entity.Client;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Client client = new Client(request.getParameter("firstName"),
                request.getParameter("lastName"),
                request.getParameter("email"),
                request.getParameter("password"));

        ClientDaoImpl impl = new ClientDaoImpl();
        String clientName = request.getParameter("firstName") + " " + request.getParameter("lastName");
        impl.save(client);

        AccountDaoImpl accountDao = new AccountDaoImpl();
        String[] currencies = {"UAH", "USD", "EUR", "RUB"};
        for (String currency: currencies) {
            accountDao.save(new Account(client, "0", currency));
        }

        request.getSession().setAttribute("clientName", clientName);
        RequestDispatcher view = getServletContext().getRequestDispatcher("/profile.jsp");
        view.forward(request, response);
    }
}

