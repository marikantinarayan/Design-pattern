package com.Mediatordesign.demo;

public class MediatorDemo {
	//step:3

	public static void main(String[] args) {
		User robert=new User("robert");
		User John=new User("John");
		robert.sendmessage("Hi ! John !");
		John.sendmessage("Hello ! robert");
	
		// TODO Auto-generated method stub

	}

}
