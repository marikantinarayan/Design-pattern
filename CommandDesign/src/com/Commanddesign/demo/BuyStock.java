package com.Commanddesign.demo;

public class BuyStock  implements Order
//step :3
{
	private Stock abcstock;
	
	public BuyStock(Stock abcstock) {
		super();
		this.abcstock = abcstock;
	}


	@Override
	public void execute() {
		abcstock.buy();
		// TODO Auto-generated method stub
		
	}

}
