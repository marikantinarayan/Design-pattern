package com.AbstractFactory.demo;

public class shapefactory extends Abstractfactory
{
	//step:6
	@Override
	public shape getshape(String shapetype)
	{
		if(shapetype==null) 
		{
			return null;		
		}
		if (shapetype.equalsIgnoreCase("Circle")) 
		{ 
			return new Circle();
			
		}
		else if (shapetype.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle();
			
		}
		else if (shapetype.equalsIgnoreCase("Square"))
		{
			return new Square();
			
		}
		// TODO Auto-generated method stub
		return null;
	}
	@Override
public	color getcolor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
