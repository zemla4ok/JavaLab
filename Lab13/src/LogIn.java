import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Calendar;

@WebServlet("/Login")
public class LogIn extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if(request.getParameter("userName").equals("admin")&&
                request.getParameter("userPass").equals("admin")) {
            HttpSession session = request.getSession();
            if(Calendar.getInstance().getTime().getHours() < 17){
                session.setAttribute("hello", "Good Morning");
            }else{
                session.setAttribute("hello", "Good Evening");
            }
            response.sendRedirect("hello.jsp");
        }else{
            response.sendRedirect("error.jsp");
        }
    }
}
