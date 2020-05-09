package com.Chainresponsibilitydesign.demo;

public class ChainDemo {
	//step:3
	private static AbstractLoger getchainoflogger() {
		AbstractLoger errorlogger=new ErrorLogger(AbstractLoger.ERROR);
		AbstractLoger filelogger=new FileLogger(AbstractLoger.DEBUG);
		AbstractLoger consolelogger=new ConsoleLogger(AbstractLoger.INFO);
		errorlogger.setNextlogger(filelogger);
		filelogger.setNextlogger(consolelogger);
		return errorlogger;
		
	}

	public static void main(String[] args) {
		AbstractLoger loggerchain=getchainoflogger();
		loggerchain.logmessage(AbstractLoger.INFO, "This is information");
		System.out.println("");
		loggerchain.logmessage(AbstractLoger.DEBUG, "this is debug level information");
		System.out.println("");
		loggerchain.logmessage(AbstractLoger.ERROR, "This is an Error information");
		// TODO Auto-generated method stub

	}

}
