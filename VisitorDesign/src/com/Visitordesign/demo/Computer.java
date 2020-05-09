package com.Visitordesign.demo;

public class Computer implements computerPart
//step:2
{
	computerPart[] parts;
	 public Computer() 
	{
		parts= new computerPart[] {	new Mouse(),new Keyboard(),new Monitor()};
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Computerpartvisitor computerpartvisitor) {
		for (int i = 0; i < parts.length; i++) 
		{
			parts[i].accept(computerpartvisitor);
			
		}
		computerpartvisitor.visit(this);
		// TODO Auto-generated method stub
		
	}

}
