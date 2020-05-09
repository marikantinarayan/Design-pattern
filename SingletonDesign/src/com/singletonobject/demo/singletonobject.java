package com.singletonobject.demo;

public class singletonobject 
{
	// create an object of singletonobject
	private static singletonobject instance =new singletonobject();
	//constructor  private 
	 private singletonobject() {
		 
	 }
	 //Get the object avaliable
public static singletonobject getinstance() {
	return instance;
}
public void showmessage() {
	System.out.println("Hello world");
}
}
