package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();



        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("email")) {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
        rd.forward(request, response);
    }
}

