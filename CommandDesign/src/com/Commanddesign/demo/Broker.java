package com.Commanddesign.demo;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	//step:4
	private List<Order>orderlist=new ArrayList<Order>();
	public void takeOrder(Order order) {
		orderlist.add(order);
	}
	public void placeOrders() {
		for (Order orderr : orderlist)
		{
			orderr.execute();
			
		}
		orderlist.clear();
		
	}

}
