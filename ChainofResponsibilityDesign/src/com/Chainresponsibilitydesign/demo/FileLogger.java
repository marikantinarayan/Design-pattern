package com.Chainresponsibilitydesign.demo;

public class FileLogger extends AbstractLoger
//step:2
{
	public FileLogger(int level) {
		this.level=level;
		
	}

	@Override
	protected void Writer(String message) {
		System.out.println("File :logger:"+message);
		// TODO Auto-generated method stub
		
	}

}
