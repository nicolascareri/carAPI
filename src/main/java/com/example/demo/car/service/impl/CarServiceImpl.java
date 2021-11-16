package com.example.demo.car.service.impl;

import com.example.demo.car.domain.Car;
import com.example.demo.car.repository.CarRepository;
import com.example.demo.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    @Override
    public Car getById(Integer id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Car create(Car car) {
        return carRepository.save(car);
    }

    @Override
    @Transactional
    public Car update(Car car) {
        return carRepository.save(car);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        carRepository.deleteById(id);
    }
}
