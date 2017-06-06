import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

@WebServlet("/Time")
public class Time extends HttpServlet {
    public void init(){

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println(new Date().toString());
        printWriter.println("protocol: " + request.getProtocol());
        printWriter.println("client IP: " + request.getRemoteAddr());
        printWriter.println("client name: " + request.getRemoteUser());
        printWriter.println("method: " + request.getMethod());
        printWriter.println("URL: " + request.getRequestURL());
        printWriter.println("information about header");
        Enumeration<String> e = request.getHeaderNames();
        while(e.hasMoreElements()){
            String name = e.nextElement();
            String value = request.getHeader(name);
            printWriter.println(name + ":  " + value);
        }
    }
    public void destroy(){

    }
}