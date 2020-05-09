package com.Visitordesign.demo;

public class ComputerPartDisplayVIsitor implements Computerpartvisitor
//step:4
{

	@Override
	public void visit(Computer computer) {
		System.out.println("Displaying computer");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Displaying Mouse");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Displaying keyboard");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Displaying monitorr");
		// TODO Auto-generated method stub
		
	}

}
