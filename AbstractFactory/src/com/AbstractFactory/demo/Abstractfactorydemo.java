package com.AbstractFactory.demo;

public class Abstractfactorydemo {

	public static void main(String[] args) {
		Abstractfactory af=factoryproducts.getfactory("shapefactory");
		shape shape1=af.getshape("Circle");
		shape1.draw();
		shape shape2=af.getshape("Rectangle");
		shape2.draw();
		shape shape3=af.getshape("Square");
		shape3.draw();
		
		Abstractfactory cf=factoryproducts.getfactory("colorfactory");
		color cl1=cf.getcolor("Red");
		cl1.fill();
		color cl2=cf.getcolor("Blue");
		cl2.fill();
		color cl3=cf.getcolor("Green");
		cl3.fill();
		
		
		// TODO Auto-generated method stub

	}

}
