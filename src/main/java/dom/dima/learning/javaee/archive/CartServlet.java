package dom.dima.learning.javaee.archive;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/cart")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cart</title>");
            out.println("<head>");
            out.println("<body>");
            out.println("<h1>C A R T</h1>");
            out.println("<a href='/order'>do order</a>");
            out.println("<br>");
            out.println("<a href='/catalog'>back to catalog</a>");
            out.println("<br>");
            out.println("<a href='/'>main page</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
