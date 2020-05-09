package com.Chainresponsibilitydesign.demo;

public abstract class AbstractLoger 
{
	//step :1
	public static int INFO=1;
	public static int DEBUG=2;
	public static int ERROR=3;
	protected int level;
	protected AbstractLoger Nextlogger;

	public void setNextlogger(AbstractLoger nextlogger) 
	{
	this.Nextlogger = nextlogger;
	}
	public void logmessage(int level,String message) 
	{
		if (this.level<=level)
		{
			Writer(message);
			
		}
		if (Nextlogger !=null )
		{
			Nextlogger.logmessage(level, message);	
		}
		
		
	}
			
	abstract protected void Writer(String message);

}
