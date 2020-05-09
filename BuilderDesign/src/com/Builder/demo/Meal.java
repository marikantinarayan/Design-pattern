package com.Builder.demo;

import java.util.ArrayList;
import java.util.List;

public class Meal 
{//step :5
	private List<Item>items=new ArrayList<>();
	public void additem(Item itemm) {
		items.add(itemm);
	}
	public float getcost() {
		float cost=0.0f;
		for (Item i : items) 
		{
			cost +=i.price();
			
		}
		return cost;
	}

	public void showitem() {
	for (Item i : items)
	{
		System.out.println("items:"+i.Name());
		System.out.println("items"+i.packing().pack());
		System.out.println("items"+i.price());
	}
	}
}
