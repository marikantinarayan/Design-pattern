package com.nari.Observer;

public class subscriber implements Observer 
{
	private String name;
	public subscriber(String name) {
		super();
		this.name = name;
	}
	private channel channel=new channel();
	@Override
	public void update()
	{
		System.out.println("hey "+ name + "video uploaded :"+ channel.title);
	}
	@Override
	public void subscribechannel(channel ch)
	{
		channel=ch;
	}
	

}
