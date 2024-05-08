package com.example.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetomany.dto.Sales;

public interface SalesRepo extends JpaRepository<Sales, Integer>{

}
