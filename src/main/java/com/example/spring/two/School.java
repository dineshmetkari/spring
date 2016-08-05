package com.example.spring.two;

/**
 * 
 * @author Mohamed Sakhri
 *
 * This class represents a school. As for the start it has only basic properties and functionalities.
 */

public class School {
	
	private String name;

	/**
	 * 
	 * @param name School's name
	 */
	public School(String name) {
		super();
		this.name = name;
	}

	/**
	 * 
	 * @return School's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name School's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void greeting() {
		System.out.println("Welcome to " + getName());
	}
	
}
