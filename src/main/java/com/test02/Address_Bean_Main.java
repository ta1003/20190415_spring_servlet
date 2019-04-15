package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Address_Bean_Main {
	public static void main(String[] args) {
		ApplicationContext application = 
				new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		// static 선언 되어있지만 각각 생성이 된다 오오!?
		Address myAddress01 =  (Address)application.getBean("myAddress01");
		System.out.println(myAddress01);
		
		Address myAddress02 =  (Address)application.getBean("myAddress02");
		System.out.println(myAddress02);
		
		JobAddress lee =  (JobAddress)application.getBean("lee");
		System.out.println(lee);
		
		JobAddress kim =  (JobAddress)application.getBean("kim");
		System.out.println(kim);
	}
}
