package com.example.demo.car.controller;

import com.example.demo.car.domain.Car;
import com.example.demo.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
@CrossOrigin(origins = "http://localhost:3000")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping
    public ResponseEntity<List<Car>> getAll() {
        return new ResponseEntity<>(carService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id){
        Car car = carService.getById(id);
        if (car == null) {
            return new ResponseEntity<>("The car doesn't exist", HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(car, HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<Car> create(@RequestBody Car car){
        return new ResponseEntity<>(carService.create(car), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Car> update(@RequestBody Car car, @PathVariable Integer id){
        return new ResponseEntity<>(carService.update(car), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        carService.delete(id);
        return new ResponseEntity<>("The was deleted successfully", HttpStatus.OK);
    }

}
