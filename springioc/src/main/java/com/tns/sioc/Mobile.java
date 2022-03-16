package com.tns.sioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("successfully loaded the config");
		
		//creating airtel object
		Airtel a=(Airtel)ac.getBean("air");
		a.calling();
		a.data();
		
		//creating bsnl object
		BSNL b=(BSNL)ac.getBean("bsnl");
		b.calling();
		b.data();
		
		//creating jio object
		Jio c=(Jio)ac.getBean("jio");
		c.calling();
		c.data();
		
	}

}
