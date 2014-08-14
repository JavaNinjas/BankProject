package servlets;

import dao.ClientDaoImpl;
import entity.Client;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = (String) request.getParameter("email");
        String password = (String) request.getParameter("password");
        ClientDaoImpl i = new ClientDaoImpl();
        Client client = i.getByEmail(email);
        if (client.getPassword().equals(password)) {
            RequestDispatcher view = getServletContext().getRequestDispatcher("/profile.jsp");
            request.getSession().setAttribute("client", client);
            view.forward(request, response);
        }  else {



        }


    }

}
