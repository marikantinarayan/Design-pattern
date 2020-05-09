package com.AbstractFactory.demo;

public class factoryproducts
{
	//step 7:
public static Abstractfactory getfactory(String choice) {
	if(choice==null) {
		return null;
		
	}
	if(choice.equalsIgnoreCase("shapefactory"))
	{
		return new shapefactory();	
	}
	else if (choice.equalsIgnoreCase("colorfactory")) {
		return new colorfactory();
	}
	return null;
	
}
}
