package com.tcs.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tcs.model.Customer;

@Service
public class CustomerService {
	
	public void showCustomerDetails() {
		List<Customer> customers = Arrays.asList(new Customer("Raj",23, "indore"),
				new Customer("Richa", 12, "indore"),new Customer("Ram", 12, "Bhopal"),new Customer("Rahul", 12, "Delhi"));
		
		customers.forEach(customer -> {
			System.out.println(customer.toString());
		});
	}

}
