package com.Commanddesign.demo;

public class CommandDemo {
	//step:5

	public static void main(String[] args)
	{
		Stock abcstock=new Stock();
		BuyStock buystockorder=new BuyStock(abcstock);
		SellsStock sellsStockorder=new SellsStock(abcstock);
		Broker broke=new Broker();
		broke.takeOrder(buystockorder);
		broke.takeOrder(sellsStockorder);
		broke.placeOrders();
	
		
		// TODO Auto-generated method stub

	}

}
