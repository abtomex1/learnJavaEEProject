package dom.dima.autopark.repositories;

import dom.dima.autopark.api.Repository;
import dom.dima.autopark.entities.Driver;

import java.util.*;

public class DriverRepositoryBean implements Repository<Driver> {

    public static DriverRepositoryBean INSTANSE = new DriverRepositoryBean();

    private DriverRepositoryBean(){}


    private Map<String, Driver> drivers = new HashMap<>();


    @Override
    public Collection<Driver> findAll() {
        return drivers.values();
    }

    @Override
    public Driver findById(String id) {
        if (id == null || id.isEmpty())
        return null;
        return drivers.get(id);
    }

    @Override
    public Collection<Driver> findByIds(Collection<String> ids) {
        if(ids == null || ids.isEmpty()) return Collections.emptySet();
        Collection<Driver> result = new HashSet<>();
        for (String id : ids) {
            result.add(findById(id));
        }
        return result;
    }

    @Override
    public Driver merge(Driver driver) {
        if(driver == null) return null;
        drivers.put(driver.getId(), driver);
        return driver;
    }

    @Override
    public Collection<Driver> merge(Collection<Driver> drivers) {
        if(drivers == null || drivers.isEmpty()) return Collections.emptySet();
        for (Driver driver : drivers) {
            merge(driver);
        }
        return drivers;
    }

    @Override
    public void removeById(String id) {
        if(id == null) return;
        drivers.remove(findById(id));
    }

    @Override
    public void removeByIds(Collection<String> ids) {
        if(ids == null || ids.isEmpty()) return;
        for (String id: ids) {
            removeById(id);
        }

    }

    @Override
    public void remove(Driver driver) {
        if(driver == null) return;
        drivers.remove(driver);
    }

    @Override
    public void remove(Collection<Driver> drivers) {
        if(drivers == null || drivers.isEmpty()) return;
        for (Driver driver : drivers) {
            this.drivers.remove(driver);
        }
    }
}
