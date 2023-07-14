package br.com.compass.carProject.entity;


import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "car")

public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChassi;

    @Column
    @NotNull
    private String name;


    @Column(nullable = false)
    @NotNull
    private String brand;
    @NotNull
    @Column(nullable = false)
    private String color;
    @NotNull
    @Column(nullable = false)
    private String fabricationYear;

    public CarEntity() {

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


    public CarEntity(String name, String brand, String color, String fabricationYear) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.fabricationYear = fabricationYear;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "idChassi=" + idChassi +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", fabricationYear='" + fabricationYear + '\'' +
                '}';
    }
}



