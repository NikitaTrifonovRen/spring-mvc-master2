package web.service;

import web.Models.Car;

import java.util.List;

public interface CarService {
    public List<Car> allCars();
    public List<Car> partOfCars(Integer carNumber);
}
