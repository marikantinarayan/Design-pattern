package com.Bridgedesign.demo;

public abstract class Shape
{
	//step :3
	protected DrawAPI drawapi;

	protected Shape(DrawAPI drawapi) {
		this.drawapi = drawapi;
	}
	public abstract void Draw();
	

}
