package com.Bridgedesign.demo;

public class Circle extends Shape
{
	//step:4
	private int x,y,Radius;
	public Circle(DrawAPI drawapi, int x, int y, int radius) {
		super(drawapi);
		this.x = x;
		this.y = y;
		Radius = radius;
	}


	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		drawapi.drawcircle(Radius, x, y);
	}
	

}
