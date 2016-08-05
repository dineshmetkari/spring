package com.example.spring.one;

/**
 * 
 * @author Mohamed Sakhri
 *
 * This class represents a student. As for the start it has only basic properties and functionalities.
 */

public class Student {
	
	private String name;
	private int age;
	
	/**
	 * 
	 * @param name Student's name
	 * @param age Student's age in years
	 */
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 
	 * @return Student's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 *   param name Student's name
	 */
	public void setName(String name) {
		this.name = name;
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
		System.out.println("Hello! I'm " + getName() + ". I'm " + getAge() + ". " + message);
	}
}
