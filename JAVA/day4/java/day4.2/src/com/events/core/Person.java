package com.events.core;

public class Person {
	//tight encapsulation
	private String firstName;
	private String lastName;
	public Person(String firstName,String lastName)
	{
		System.out.println("in person's ctor");
		this.firstName=firstName;
		this.lastName=lastName;
	}


	//add a method to return person's details
	public String getDetails() {
		return this.firstName+" "+this.lastName;
	}

}
