package com.example.carservicemonitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.carservicemonitoring.model.CarService;

@Repository
public interface CarServiceRepository extends JpaRepository<CarService, Long> {
}
