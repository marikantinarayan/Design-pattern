package com.Decoratordesign.demo;

public class Redshapdexorator extends Shapedecorator
{//step:4

	public Redshapdexorator(Shape decoratorshape) {
		super(decoratorshape);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Draw() {
		decoratorshape.Draw();
		setRedborder(decoratorshape);
		// TODO Auto-generated method stub
	}
	private void setRedborder(Shape decoratorshape) {
		System.out.println("Border color:red");
		
	}
}
