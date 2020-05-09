package com.nari.Composite;

import java.util.ArrayList;
import java.util.List;

interface component
{
  void showprice();
}

class leaf implements component
{
		int price;
		String name;	
	public leaf(int price, String name) {
			super();
			this.price = price;
			this.name = name;
		}

	@Override
	public void showprice() {
		
		System.out.println(name+":"+price);
		// TODO Auto-generated method stub
		
	}
	

}
class composite implements component
{
	String name;
	
	public composite(String name) {
		super();
		this.name = name;
	}
	
	List<component> c =new ArrayList<>();
	
	public void addcomponent(component com) 
	{
		c.add(com);
	}
	@Override
	public void showprice() {
		
		System.out.println(name);
		for (component m : c)
		{
			m.showprice();
			
			
		}
		// TODO Auto-generated method stub
		
	}

	
}


