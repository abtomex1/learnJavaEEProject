package dom.dima.learning.javaee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CatalogServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Catalog</title>");
            out.println("<head>");
            out.println("<body>");
            out.println("<h1>C A T A L O G</h1>");
            out.println("<ul>");
            out.println("<li><a href='/product'>product</a></li>");
            out.println("<li><a href='/product'>product</a></li>");
            out.println("<li><a href='/product'>product</a></li>");
            out.println("</ul>");

//            out.println("<a href='/product'>product</a>");
            out.println("<br>");
            out.println("<a href='/'>back to main page</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
