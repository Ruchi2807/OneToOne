package com.example.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetomany.dto.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
