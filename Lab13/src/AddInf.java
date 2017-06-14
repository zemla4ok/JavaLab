import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddInf")
public class AddInf extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("Name");
        String surname = req.getParameter("Surname");
        req.getSession().setAttribute("Name", name);
        req.getSession().setAttribute("Surname", surname);

        resp.sendRedirect("addAdress.jsp");
    }
}
