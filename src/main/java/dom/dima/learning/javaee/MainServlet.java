package dom.dima.learning.javaee;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class MainServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Main page</title>");
            out.println("<head>");
            out.println("<body>");
            out.println("<h1>M A I N _ P A G E</h1>");
            out.println("<a href='/catalog'>catalog</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }


}
