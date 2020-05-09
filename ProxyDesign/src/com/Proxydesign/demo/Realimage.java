package com.Proxydesign.demo;

public class Realimage implements Image
//step:2
{
	private String fileName;
	
	public Realimage(String fileName) {
		super();
		this.fileName = fileName;
		loadfromdisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying "+fileName);
		// TODO Auto-generated method stub
	}
	private void loadfromdisk(String fileName) {
		System.out.println("loading "+fileName);
	}
}
