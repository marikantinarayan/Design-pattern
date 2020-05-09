package com.Prototypedesign.demo;

public class Prototypedemo {

	public static void main(String[] args) {
		Shapecache.loadcache();
		Shape cloneshape=(Shape) Shapecache.getshape("1");
		System.out.println("Shape:"+cloneshape.gettype());
		Shape cloneshape2=(Shape) Shapecache.getshape("2");
		System.out.println("Shape:"+cloneshape2.gettype());
		Shape cloneshape3=(Shape) Shapecache.getshape("3");
		System.out.println("Shape:"+cloneshape3.gettype());
		
		// TODO Auto-generated method stub

	}

}
