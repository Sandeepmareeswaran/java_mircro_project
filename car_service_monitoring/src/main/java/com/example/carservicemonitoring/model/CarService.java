package com.example.carservicemonitoring.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "car_service")
public class CarService {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String carmodel;
    
    
    @Column(nullable = false)
    private LocalDate date_of_service;
    
    @Column(nullable = false)
    private LocalDate next_date_for_service;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public LocalDate getDate_of_service() {
        return date_of_service;
    }

    public void setDate_of_service(LocalDate date_of_service) {
        this.date_of_service = date_of_service;
    }

    public LocalDate getNext_date_for_service() {
        return next_date_for_service;
    }

    public void setNext_date_for_service(LocalDate next_date_for_service) {
        this.next_date_for_service = next_date_for_service;
    }
}
