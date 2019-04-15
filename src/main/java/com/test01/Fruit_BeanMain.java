package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Fruit_BeanMain {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/Beans.xml");
				
		//MessageBean coffee = (MessageBean) factory.getBean("coffee");
		//coffee.sayYeah();
		
		MessageBean mangoTomato =  (MessageBean) factory.getBean("mangoTomato");
		mangoTomato.sayYeah();
	}
}
