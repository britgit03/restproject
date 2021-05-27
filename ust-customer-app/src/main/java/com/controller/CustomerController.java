package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping
	public void saveCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
	}
	
	@GetMapping
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
		
	}
	
	@GetMapping(path="/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") Integer customerId){
		return customerService.getCustomerById(customerId);
		
	}

}
