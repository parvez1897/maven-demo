package com.tcs.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

	private Customer customer;
	
	@Before
	public void setup() {
		customer = new Customer();
		customer.setName("Raj");
		customer.setAge(23);
		customer.setAddress("Indore");
	}
	
	@Test
	public void testCustomer() {
		assertThat(customer.getName()).isEqualTo("Raj");
		assertThat(customer.getAge()).isEqualTo(23);
		assertThat(customer.getAddress()).isEqualTo("Indore");
	}
}
