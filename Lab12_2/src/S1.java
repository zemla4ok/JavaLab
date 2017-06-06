import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/S1")
public class S1 extends HttpServlet {
    private static boolean flag = true;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        if (flag) {
            HttpSession ses = request.getSession();
            ses.setAttribute("end", "Dimas");
            response.sendRedirect("S2");
            flag = false;
        } else {
            flag = true;
            response.sendRedirect("params.jsp");
        }
    }

    public void init() {
    }

    public void destroy() {
    }
}
