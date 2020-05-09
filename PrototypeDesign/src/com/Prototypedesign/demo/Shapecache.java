package com.Prototypedesign.demo;

import java.util.Hashtable;

public class Shapecache
{
	//step:3
	private static Hashtable<String ,Shape>shapemap=new Hashtable<String, Shape>();
	public static Shape getshape(String shapeid) {
		Shape cacheshape=shapemap.get(shapeid);
		return (Shape) cacheshape.clone();
		
	}
	//for each shape run database query and create shape 
	public static void loadcache() {
		Circle circle=new Circle();
		circle.setId("1");
		shapemap.put(circle.getId(), circle);
		Square square= new Square();
		square.setId("2");
		shapemap.put(square.getId(),square);
		Rectangle rectangle=new Rectangle();
		rectangle.setId("3");
		shapemap.put(rectangle.getId(), rectangle);
		}

}
