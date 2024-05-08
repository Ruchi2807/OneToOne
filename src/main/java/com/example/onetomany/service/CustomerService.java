package com.example.onetomany.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetomany.dto.Customer;
import com.example.onetomany.dto.Sales;
import com.example.onetomany.repository.CustomerRepo;
import com.example.onetomany.repository.SalesRepo;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private SalesRepo salesRepo;

	public Customer save(Customer customer) {
//		Customer customer2=new Customer(customer.getId(), customer.getName(), customer.getSales());
//		List<Sales> sales=new ArrayList<>();
//		for (Sales sales1 : customer.getSales()) {
//			Sales newSales=new Sales();
//			newSales.setId(sales1.getId());
//			newSales.setName(sales1.getName());
//			sales.add(newSales);
//		}
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

}
