package com.Interpreterdesign.demo;

public class TerminalExpression implements Expression
 //step:2
{
	private String data;
	
	public TerminalExpression(String data) {
		super();
		this.data = data;
	}


	@Override
	public boolean interpret(String context) {
		if (context.contains(data)) 
		{
			return true;
			
		}
		// TODO Auto-generated method stub
		return false;
	}

}
