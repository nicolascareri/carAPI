package com.example.demo.car.service;

import com.example.demo.car.domain.Car;

import java.util.List;

public interface CarService {
    List<Car> getAll();

    Car getById(Integer id);

    Car create(Car car);

    Car update(Car car);

    void delete(Integer id);
}
