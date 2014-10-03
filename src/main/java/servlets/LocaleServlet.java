package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;


public class LocaleServlet extends HttpServlet {
    private String locale;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration enumeration = request.getParameterNames();

        while (enumeration.hasMoreElements()) {
            locale = String.valueOf(enumeration.nextElement());
        }

        request.getSession().setAttribute("locale", locale);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
        rd.forward(request, response);
    }
}
