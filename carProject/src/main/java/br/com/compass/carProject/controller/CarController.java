package br.com.compass.carProject.controller;


import br.com.compass.carProject.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/car")
    public String car() {
        return carService.getString();

    }

//	@GetMapping("/post")
//	public String post() {
//		return "Dentro do controller";
//
//	}

}