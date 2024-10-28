package com.example.carservicemonitoring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carservicemonitoring.model.CarService;
import com.example.carservicemonitoring.repository.CarServiceRepository;

@Service
public class CarServiceService {

    @Autowired
    private CarServiceRepository carServiceRepository;

    public List<CarService> getAllCarServices() {
        return carServiceRepository.findAll();
    }

    public CarService saveCarService(CarService carService) {
        return carServiceRepository.save(carService);
    }

    public void deleteCarService(Long id) {
        carServiceRepository.deleteById(id);
    }
}
