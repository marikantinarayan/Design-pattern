package com.Decoratordesign.demo;

public class DecoratorDemo {
	//step:5
	public static void main(String[] args) {
		Shape circle=new circle();
		Shape redcircle=new Redshapdexorator(new circle());
		Shape redrectangle=new Redshapdexorator(new Rectangle());
		System.out.println("circle with normal border");
		circle.Draw();
		System.out.println("\nCricle of red border");
		redcircle.Draw();
		System.out.println("\nRectangle of red border");
		redrectangle.Draw();
				
		
	}

}
