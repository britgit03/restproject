package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Customer;

@Service
public class CustomerService {
	
	private List<Customer> customer = new ArrayList<>(
			Arrays.asList(new Customer(1,"Britgit","Thanjavur",10000),
					new Customer(2,"Anu","Chennai",5000)
					)
			
			);
	
	public void saveCustomer(Customer customerdetails) {
		customer.add(customerdetails);
	}
	
	public Customer getCustomerById(Integer customerId) {
		return customer.stream().filter(c -> c.getCustomerId()==(customerId)).findFirst().get();
		
	}
   public List<Customer> getAllCustomer(){
	return customer;
	   
   }
}
