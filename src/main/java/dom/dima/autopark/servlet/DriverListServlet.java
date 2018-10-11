package dom.dima.autopark.servlet;

import dom.dima.autopark.api.Repository;
import dom.dima.autopark.entities.Driver;
import dom.dima.autopark.repositories.DriverRepositoryBean;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@WebServlet(urlPatterns = "/driver-list")
public class DriverListServlet extends HttpServlet {
//    @Inject
    private Repository<Driver> repository = DriverRepositoryBean.INSTANSE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        final Collection<Driver> drivers = repository.findAll();
        req.setAttribute("drivers", drivers);
        req.getRequestDispatcher("WEB-INF/views/drivers.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
