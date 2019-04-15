package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NickName_Main {

	public static void main(String[] args) {		
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("com/test03/Beans.xml");
		
		NickNamePri my = factory.getBean("nickNamePri",NickNamePri.class);
		System.out.println(my);
	}

}
