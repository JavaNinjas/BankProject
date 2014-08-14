package servlets;

import dao.ClientDaoImpl;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = (String) request.getParameter("email");
        ClientDaoImpl i = new ClientDaoImpl();
        String client = i.getByEmail(email).toString();
        request.getSession().setAttribute("client", client);
        RequestDispatcher view = getServletContext().getRequestDispatcher("/profile.jsp");
        view.forward(request, response);
    }

}
