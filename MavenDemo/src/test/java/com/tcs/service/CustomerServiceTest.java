package com.tcs.service;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.tcs.model.Customer;

public class CustomerServiceTest {
	
	@InjectMocks
	private CustomerService service;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	List<Customer> customers = Arrays.asList(new Customer("Raj",23, "indore"),
			new Customer("Richa", 12, "indore"),new Customer("Ram", 12, "Bhopal"),new Customer("Rahul", 12, "Delhi"));
	
	@Test
	public void testShowCustomerDetails() {
		service.showCustomerDetails();
	}

}
