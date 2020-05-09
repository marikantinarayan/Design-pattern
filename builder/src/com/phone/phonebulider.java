package com.phone;

public class phonebulider 
{
	private String os;
	private int ram;
	private String processor;
	private double screensize;
	private int battery;
	
	public phonebulider setOs(String os) {
		this.os = os;
		return this;
	}
	public phonebulider setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public phonebulider setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public phonebulider setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}
	public phonebulider setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public phone getphone()
	{
		return new phone(os, ram, processor, screensize, battery);
	}
	
}
