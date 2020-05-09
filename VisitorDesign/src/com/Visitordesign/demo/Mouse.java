package com.Visitordesign.demo;

public class Mouse implements computerPart
//step:2
{

	@Override
	public void accept(Computerpartvisitor computerpartvisitor)
	{
		computerpartvisitor.visit(this);
		// TODO Auto-generated method stub
		
	}

}
