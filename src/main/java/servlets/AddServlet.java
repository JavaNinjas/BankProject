package servlets;
import dao.ClientDaoImpl;
import dao.GenericDaoImpl;
import entity.Client;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Client client = new Client(request.getParameter("firstName"), request.getParameter("lastName"));
        ClientDaoImpl impl = new ClientDaoImpl();
        String clientAdded = request.getParameter("firstName") + " " + request.getParameter("lastName");
        impl.create(client);
        impl.destroy();

        request.getSession().setAttribute("clientAdded", clientAdded);
        RequestDispatcher view = getServletContext().getRequestDispatcher("/added.jsp");
        view.forward(request, response);
    }
}

