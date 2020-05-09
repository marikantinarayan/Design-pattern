package com.Chainresponsibilitydesign.demo;

public class ConsoleLogger extends AbstractLoger
//step:2
{
	public ConsoleLogger(int level) {
		this.level=level;
	}

	@Override
	protected void Writer(String message) {
		System.out.println("Standard console:logger:"+message);
		// TODO Auto-generated method stub
		
	}

}
