package com.Visitordesign.demo;

public class VisitorDemo {
//step:5
	public static void main(String[] args) {
		computerPart compter=new Computer();
		compter.accept(new ComputerPartDisplayVIsitor());
		// TODO Auto-generated method stub

	}

}
