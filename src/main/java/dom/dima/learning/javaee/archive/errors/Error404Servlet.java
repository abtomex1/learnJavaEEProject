package dom.dima.learning.javaee.archive.errors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns = "/error404")
public class Error404Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Error404</title>");
            out.println("<head>");
            out.println("<body>");
            out.println("<h1>ERROR 404</h1>");
            out.println("Page not found");
            out.println("<br>");
            out.println("<a href='/catalog'>back to catalog</a>");
            out.println("<br>");
            out.println("<a href='/'>main page</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
