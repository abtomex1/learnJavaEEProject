package dom.dima.learning.javaee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "product")
public class ProductServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Product</title>");
            out.println("<head>");
            out.println("<body>");
            out.println("<h1>P R O D U C T</h1>");
            out.println("<a href='/catalog'>back to catalog</a>");
            out.println("<br>");
            out.println("<a href='/cart'>go to cart</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
