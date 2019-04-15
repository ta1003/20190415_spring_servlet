package com.test01;



public class MessageBeanImpl implements MessageBean{

	private String fruit; // 과일	
	private int price; // 가격
	
	public MessageBeanImpl() {	
		this.fruit = "coffee";
		this.price = 1500;		
	}	
	
	public MessageBeanImpl(String fruit, int price) {
		super();
		this.fruit = fruit;
		this.price = price;
	}


	@Override
	public void sayYeah() {		
		System.out.println(fruit+"의 가격은? "+price);
	}
}
