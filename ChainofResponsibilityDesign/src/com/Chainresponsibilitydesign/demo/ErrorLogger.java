package com.Chainresponsibilitydesign.demo;

public class ErrorLogger extends AbstractLoger
//step:2
{
  public ErrorLogger(int level) {
	  this.level=level;
  }
	@Override
	protected void Writer(String message) {
		System.out.println("ERROR: logger:"+message);
		// TODO Auto-generated method stub
		
	}

}
