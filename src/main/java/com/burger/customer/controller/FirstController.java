package com.burger.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.burger.customer.model.customer;
import com.burger.customer.repository.CustomerRepo;

@RestController
@ComponentScan(basePackages ="com.burger.customer.*")
@CrossOrigin("*")
public class FirstController {

	@Autowired
	CustomerRepo repository;
	
	@Autowired
	customer cust;
	
	@RequestMapping(value= "/getAllCustomerInfo")
	public List<customer> getAllCustomerData()
	{
		return repository.findAll();
	}
	
	@RequestMapping(value= "/insertCustomer")
	public void insertCustomer(@RequestBody customer cus)
	{
		
		
		repository.save(cus);
	}
	
}
