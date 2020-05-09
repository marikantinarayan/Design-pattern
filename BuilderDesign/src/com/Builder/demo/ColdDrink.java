package com.Builder.demo;

public abstract class ColdDrink implements Item
{//step:3
	@Override
	public packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public abstract float price() ;
	

}
