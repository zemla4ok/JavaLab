import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

@WebServlet(name="auth", urlPatterns = "/User")
public class User extends HttpServlet {
    private static int count = 1;
    public void init() {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        if(request.getParameter("userName").equals("admin")&&
                request.getParameter("userPass").equals("admin")){
            Cookie cookie = new Cookie("admin", "ADMIN  " + count++ + "   " + request.getSession().getLastAccessedTime());
            cookie.setMaxAge(60*60);
            response.addCookie(cookie);

            response.sendRedirect("ServletSesAdmin");
        }
        else if(request.getParameter("userName").equals("user") &&
                request.getParameter("userPass").equals("user")){
            response.sendRedirect("ServletSesUser");
        }
    }
    public void destroy() {
    }
}
