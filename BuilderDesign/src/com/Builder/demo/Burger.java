package com.Builder.demo;

public abstract class Burger implements Item
{// step :3

	@Override
	public packing packing() 
	{
		// TODO Auto-generated method stub
		return new Wrapper();
		}

	@Override
	public abstract float price() ;
	

}
