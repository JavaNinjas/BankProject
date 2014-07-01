import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("deleteThisRow");
        ClientDaoImpl impl = new ClientDaoImpl();

        String clientDeleted = impl.getById(Integer.valueOf(id)).getFirstName() + " " + impl.getById(Integer.valueOf(id)).getLastName();

        impl.deleteById(Integer.valueOf(id));
        impl.destroy();

        request.getSession().setAttribute("clientDeleted", clientDeleted);

        RequestDispatcher view = getServletContext().getRequestDispatcher("/deleted.jsp");
        view.forward(request, response);
    }
}