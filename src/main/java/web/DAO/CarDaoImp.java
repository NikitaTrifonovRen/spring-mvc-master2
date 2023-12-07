package web.DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.Models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
@Repository
public class CarDaoImp implements CarDao{
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(1,"polo",180));
        cars.add(new Car(2,"ceed",220));
        cars.add(new Car(3,"rio",180));
        cars.add(new Car(4,"solaris",180));
        cars.add(new Car(5,"camry",190));

    }
    @Override
    public List<Car> allCars(){
        return cars;
    }
    @Override

    public List<Car> partOfCars(Integer carNumber){
            return cars.subList(0, carNumber);

    }


}
