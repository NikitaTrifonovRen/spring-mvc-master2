package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDao;
import web.Models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> allCars() {
        return carDao.allCars();
    }

    @Override
    public List<Car> partOfCars(Integer carNumber) {
        return carDao.partOfCars(carNumber);
    }
}
