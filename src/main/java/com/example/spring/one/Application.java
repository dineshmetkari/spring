package com.example.spring.one;

/**
 * 
 * @author Mohamed Sakhri
 *
 * Application to demonstrate how spring framework can be used.
 * 
 */

public class Application {

	public static void main(String[] args) {
		Student student = new Student("Max Mustermman", 18);
		student.greeting("Greeting from java course!");
	}

}
