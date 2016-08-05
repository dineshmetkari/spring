package com.example.spring.four;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Mohamed Sakhri
 *
 * Application to demonstrate how spring framework can be used.
 * 
 */

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Defining where to get the beans' configuration from 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/spring/four/springConfig.xml");

		// Get the bean with the id student. It's the only bean we have defined 
		Student student = (Student) context.getBean("student");
		
		// The name and the age should be taken care of by the bean configuration as constuctor's parameters
		student.greeting("Greeting from Spring using spring setter-based dependency injection");
		
	}

}
