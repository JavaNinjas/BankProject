


import parser.ContentEurUah;
import parser.ContentUsdUah;
import parser.Exchange;
import parser.RateEurUah;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Client> clients = new ArrayList<Client>();
        ClientDaoImpl impl = new ClientDaoImpl();
        clients = (ArrayList)impl.getAll();

        impl.destroy();

     /*   ArrayList<Integer> getRates = new ArrayList<Integer>();

        Exchange ex = new Exchange();
        ContentUsdUah us = new ContentUsdUah();
        ContentEurUah eu = new ContentEurUah();
        try {
            us.downloadContent();
            eu.downloadContent();
        } catch (Exception e) {
            e.printStackTrace();
        }*/



        request.getSession().setAttribute("clients", clients);

  /*      request.getSession().setAttribute("usdRate", ex.fromUSDtoUAH(1.00));
        request.getSession().setAttribute("euroRate", ex.fromEURtoUAH(1.00));*/





        RequestDispatcher view = getServletContext().getRequestDispatcher("/result.jsp");
        view.forward(request, response);
    }

}
