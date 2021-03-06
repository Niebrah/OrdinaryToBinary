package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//there is a bean called HelloWorld which is its id, its value is different
		HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
		obj.getMessage();
	}

}
