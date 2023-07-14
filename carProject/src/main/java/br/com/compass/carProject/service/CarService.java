package br.com.compass.carProject.service;


import br.com.compass.carProject.dto.CarDTO;
import br.com.compass.carProject.entity.CarEntity;
import br.com.compass.carProject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {


    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarEntity saveCar(CarDTO carDTO) {
        validateBrand(carDTO.getBrand());

        CarEntity carEntity = new CarEntity();
                                                                                                      carEntity.setName(carDTO.getName());
        carEntity.setBrand(carDTO.getBrand());
        carEntity.setColor(carDTO.getColor());
        carEntity.setFabricationYear(carDTO.getFabricationYear());

        return carRepository.save(carEntity);
    }

    public CarEntity getCarById(Long idChassi) {
        return carRepository.findById(idChassi)
                .orElseThrow(() -> new IllegalArgumentException("This idChassi:  " + idChassi + " was not found"));
    }


    private void validateBrand(String brand) {
        if (!brand.equals("Ford") && !brand.equals("Chevrolet") && !brand.equals("BMW") && !brand.equals("Volvo")) {
            throw new IllegalArgumentException("Only accepted brands: Ford, Chevrolet, BMW, Volvo\nInvalid brand: " + brand);
        }
    }
}


