package web.DAO;

import web.Models.Car;

import java.util.List;

public interface CarDao {
    public List<Car> allCars();
    public List<Car> partOfCars(Integer carNumber);
}
