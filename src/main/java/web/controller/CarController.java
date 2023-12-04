package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDao;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarDao carDao;

    @Autowired
    public CarController (CarDao carDao){
        this.carDao = carDao;
    }



    @GetMapping(value = "/cars")
    public String printPartOfCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if (count != null) {
            if (count <= 5 & count >= 0) {
                model.addAttribute("cars", carDao.partOfCars(count));
                return "cars";
            } else {
                model.addAttribute("cars", carDao.allCars());
                return "cars";
            }
        } else {
            model.addAttribute("cars", carDao.allCars());
            return "cars";
        }

    }
}
