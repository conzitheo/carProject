package br.com.compass.carProject.controller;


import br.com.compass.carProject.dto.CarDTO;
import br.com.compass.carProject.entity.CarEntity;
import br.com.compass.carProject.service.CarService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @Autowired
    CarService carService;


    public CarController(@NotNull CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/get/{idChassi}")
    public ResponseEntity<CarEntity> getCar(@PathVariable Long idChassi) {
        try {
            CarEntity carEntity = carService.getCarById(idChassi);
            if (carEntity != null) {
                return ResponseEntity.ok(carEntity);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }


    @PostMapping("/post")
    public ResponseEntity<CarEntity> createCar(@RequestBody CarDTO carDTO) {
        CarEntity savedCarEntity = carService.saveCar(carDTO);
        return ResponseEntity.ok(savedCarEntity);
    }
}
