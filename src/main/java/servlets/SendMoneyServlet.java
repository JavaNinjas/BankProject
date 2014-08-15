package servlets;

import dao.AccountDaoImpl;
import entity.Account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.Raster;
import java.io.IOException;

public class SendMoneyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String amount = request.getParameter("amount");
        String recipient = request.getParameter("recipient");


        if (amount.equals(null)) {

        }




        AccountDaoImpl accountDao = new AccountDaoImpl();
        Account account = accountDao.getById(5);
        account.sendMoney(30000, account.getAccount_id());
        accountDao.update(account);
        accountDao.destroy();







    }
}
