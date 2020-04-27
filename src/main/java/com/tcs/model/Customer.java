package com.tcs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	private String name;
	private int age;
	private String address;

	@Override
	public String toString() {
		return "Name: "+this.name+"\tAge: "+this.age+"\t\tAddress: "+this.address;
	}
}
