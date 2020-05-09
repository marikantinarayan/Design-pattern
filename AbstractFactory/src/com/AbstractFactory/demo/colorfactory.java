package com.AbstractFactory.demo;

public class colorfactory extends Abstractfactory
{
	//step6:

	@Override
	color getcolor(String color) {
		if (color==null) 
		{
		return null;
		}
		if (color.equalsIgnoreCase("RED"))
		{
			return new Red();	
		}
		else if (color.equalsIgnoreCase("BLUE"))
		{
			return new Blue();
			
		}
		else if (color.equalsIgnoreCase("Green"))
		{
			return new Green();
			
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public shape getshape(String shapetype) {
		// TODO Auto-generated method stub
		return null;
	}

}
