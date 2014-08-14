package servlets;

import dao.AccountDaoImpl;
import dao.ClientDaoImpl;
import entity.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateAcc extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ClientDaoImpl impl = new ClientDaoImpl();

        Account account = new Account(impl.getByEmail("gryaznov.eugene@gmail.com"), 300, "UAH");

        impl.destroy();

        AccountDaoImpl impl2 = new AccountDaoImpl();
        impl2.create(account);
        impl2.destroy();


    }
}
