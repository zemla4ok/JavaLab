import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/ServletSesAdmin")
public class ServletSesAdmin extends HttpServlet {
    public void init() {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>  <H1>Admin</H1><br>");
        printWriter.println("current time  " + new Date() + "<br>");
        printWriter.println("entry time   " + request.getSession().getCreationTime() + "<br>");

        printWriter.println("session time   " + (new Date().getTime() - request.getSession().getCreationTime())/1000);
        printWriter.println("</html>");
    }
    public void destroy() {
    }
}

