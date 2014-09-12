package servlets;

import dao.ClientDaoImpl;
import entity.Client;

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

        String amount = request.getParameter("balanceUAH");






    }
}
