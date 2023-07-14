package br.com.compass.carProject.dto;

//import org.jetbrains.annotations.NotNull;


public class CarDTO {
//    @NotNull(message = "IdChassi must not be null")
    private Long idChassi;
//    @NotNull(message = "Name must not be null")
    private String name;
//    @NotNull(message = "Brand must not be null")
    private String brand;
//    @NotNull(message = "Color must not be null")
    private String color;
//    @NotNull(message = "FabricationYear must not be null")
    private String fabricationYear;


    public CarDTO(String name, String brand, String color, String fabricationYear) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.fabricationYear = fabricationYear;
    }

    public Long getIdChassi() {
        return idChassi;
    }

    public void setIdChassi(Long idChassi) {
        this.idChassi = idChassi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(String fabricationYear) {
        this.fabricationYear = fabricationYear;
    }
}
