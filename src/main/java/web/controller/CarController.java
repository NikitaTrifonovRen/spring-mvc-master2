package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;



import java.util.Optional;

@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController (CarService carService){
        this.carService = carService;
    }



    @GetMapping(value = "/cars")
    public String printPartOfCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        Optional<Integer> trueCount = Optional.ofNullable(count);
        ModelMap modelMap = trueCount.isPresent() ? model.addAttribute("cars", carService.partOfCars(count)) : model.addAttribute("cars", carService.allCars());
        return "cars";

    }


    }


