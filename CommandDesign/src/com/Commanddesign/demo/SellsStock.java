package com.Commanddesign.demo;

public class SellsStock implements Order
//step:3
{
	private Stock abcstock;
	public SellsStock(Stock abcstock) {
		super();
		this.abcstock = abcstock;
	}
	@Override
	public void execute() {
		abcstock.sell();
		// TODO Auto-generated method stub
		
	}

}
