import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

@WebServlet("/User")
public class User extends HttpServlet {
    public void init() {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        if(request.getParameter("userName").equals("admin")&&
                request.getParameter("userPass").equals("admin")){
            printWriter.println("Hello admin");
            printWriter.print(new Date().toString());
        }
        else{
            printWriter.println("invalid login or password");
        }
    }
    public void destroy() {
    }
}
