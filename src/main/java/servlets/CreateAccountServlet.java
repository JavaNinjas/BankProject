package servlets;

import dao.AccountDaoImpl;
import dao.ClientDaoImpl;
import entity.Account;
import entity.Client;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateAccountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClientDaoImpl clientDao = new ClientDaoImpl();
        Client client = clientDao.getByEmail(request.getParameter("email"));
        Account account = new Account(client, 0, "UAH");
        AccountDaoImpl accountDao = new AccountDaoImpl();
        accountDao.save(account);

    }

/*    public static void main(String[] args) {
        ClientDaoImpl clientDao = new ClientDaoImpl();
        Client client = clientDao.getByEmail("redsonja@gmail.com");
        Account account = new Account(client, 0, "UAH");
        AccountDaoImpl accountDao = new AccountDaoImpl();
        accountDao.save(account);
        clientDao.destroy();
    }*/
}
