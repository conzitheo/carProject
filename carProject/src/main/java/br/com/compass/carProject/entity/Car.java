package br.com.compass.carProject.entity;


import javax.persistence.*;

@Entity
@Table(name = "CAR")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChassi;

    private String name;

    private String rua;

    public Car() {
    }
}


