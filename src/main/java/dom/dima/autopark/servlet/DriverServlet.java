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
import java.util.Date;

@WebServlet(urlPatterns = "/drivers-create")
public class DriverServlet extends HttpServlet {

//    @Inject
    private Repository<Driver> repository = DriverRepositoryBean.INSTANSE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        repository.merge(new Driver(
                "121",
                "Иванов",
                "Владимир",
                "Павлович",
                new Date(1980, 10, 25),
                37,
                new Date(2010, 04, 11))
                );
        repository.merge(new Driver(
                "151",
                "Кузнецов",
                "Михаил",
                "Игоревич",
                new Date(1974, 03, 14),
                44,
                new Date(2015, 12, 05))
        );

        resp.sendRedirect("driver-list");
    }
}
