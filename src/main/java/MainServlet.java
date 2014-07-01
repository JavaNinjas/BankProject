import javax.servlet.RequestDispatcher;
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
        ArrayList<Client> clients = new ArrayList<>();
        ClientDaoImpl impl = new ClientDaoImpl();
        clients = (ArrayList)impl.getAll();

        impl.destroy();

        request.getSession().setAttribute("clients", clients);
        RequestDispatcher view = getServletContext().getRequestDispatcher("/result.jsp");
        view.forward(request, response);
    }
}
