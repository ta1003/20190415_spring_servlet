package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NickName_anno_Main {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/Beans.xml");
		
		NickNamePri mymy = factory.getBean("nick",NickNamePri.class);
		System.out.println(mymy);
	}
}
