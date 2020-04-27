package com.tcs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.service.CustomerService;

@SpringBootApplication
public class MavenDemoApplication implements CommandLineRunner{

	@Autowired
	private CustomerService service;
	
	public static void main(String[] args) {
		SpringApplication.run(MavenDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.showCustomerDetails();
	}

}
