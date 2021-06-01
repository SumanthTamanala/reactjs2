package com.capg.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Employee employee1 =(Employee)		context.getBean("emp1");
		Employee employee2=(Employee) context.getBean("emp2");
		SBU sbu1=(SBU) context.getBean("sbu");
		//System.out.println(sbu1);
		sbu1.getEmployees();

	}

}
