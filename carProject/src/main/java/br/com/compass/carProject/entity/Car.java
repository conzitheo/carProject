package br.com.compass.carProject.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAR")
public class Car {

    @Id
    private Long idChassi;

    private String name;

    private String endereco;

}
