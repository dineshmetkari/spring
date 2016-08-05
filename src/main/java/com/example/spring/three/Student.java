package com.example.spring.three;

/**
 * 
 * @author Mohamed Sakhri
 *
 * This class represents a student. As for the start it has only basic properties and functionalities.
 */

public class Student {
	
	private String firstName;
	private String lastName;
	private int age;
	
	/**
	 * 
	 * @param name Student's first name
	 * @param age Student's age in years
	 */
	public Student(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/**
	 * 
	 * @return Student's first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * 
	 *   param name Student's first first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * 
	 * @return Student's last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * 
	 *   param name Student's last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * 
	 * @return Student's age in years
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * 
	 * @param age Student's age in years
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * 
	 * @param message to be displayed
	 */
	public void greeting(String message) {
		System.out.println("Hello! I'm " + getFirstName() + " " + getLastName() + ". I'm " + getAge() + ". " + message);
	}
}
