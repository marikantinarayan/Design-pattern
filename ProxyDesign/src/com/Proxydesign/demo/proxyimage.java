package com.Proxydesign.demo;

public class proxyimage implements Image
//step:2
{
	private Realimage realimage;
	private String filename;
	
	public proxyimage(String filename) {
		super();
		this.filename = filename;
	}


	@Override
	public void display() {
		if (realimage==null) 
		{
		realimage=new Realimage(filename);
		
		}
		realimage.display();
		// TODO Auto-generated method stub
		
	}

}
