package com.narayan.prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Bookshop bs=new Bookshop();
		bs.setShopname("homendess");
		bs.loaddata();
		//bs.getBook().remove(2);
	//	System.out.println(bs);
		
		Bookshop bs1=bs.clone();
		bs1.setShopname("A");
		bs.getBook().remove(2);
		System.out.println(bs);
		System.out.println(bs1);
		
		// TODO Auto-generated method stub

	}

}
