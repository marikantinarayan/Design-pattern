package com.Decoratordesign.demo;

public abstract class Shapedecorator implements Shape
{//step:3
	protected Shape decoratorshape;
	
	public Shapedecorator(Shape decoratorshape) {
	super();
	this.decoratorshape = decoratorshape;
}
	@Override
	public void Draw() {
		decoratorshape.Draw();
		// TODO Auto-generated method stub
		
	}

}
