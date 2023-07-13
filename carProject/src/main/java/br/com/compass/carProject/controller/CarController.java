package br.com.compass.carProject.controller;


import br.com.compass.carProject.entity.Car;
import br.com.compass.carProject.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/car")
    public String car() {
        return carService.getString();

    }

    @PostMapping("/post")
    public String post(@RequestBody Car car) {
        return car.toString();

    }


    @PostMapping("/post")
    public String post(@PathVariable String idChassi) {
        return idChassi;
    }
}