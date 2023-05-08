package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.passengerModel;

public interface passengerRepo extends JpaRepository<passengerModel, Integer> {

}
