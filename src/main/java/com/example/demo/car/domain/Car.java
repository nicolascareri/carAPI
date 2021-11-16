package com.example.demo.car.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "car_name")
    private String name;

    @Column(name = "color")
    private String color;

    @Column(name = "car_size_type")
    private Integer sizeType;

    @Column(name = "car_brand")
    private String brand;

}
