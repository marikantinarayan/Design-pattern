package com.nari.Composite;

public class CompositeTest {

	public static void main(String[] args)
	{
		component hd=new leaf(4000,"HD");
		component mouse=new leaf(5000,"mouse");
		component monitor=new leaf(6000,"monitor");
		component ram=new leaf(7000,"ram");
		component cpu=new leaf(8000,"cpu");
		 
		
		composite ph=new composite("peri");
		composite cabinet=new composite("cabinet");
		composite mb=new composite("mb");
		composite computer=new composite("computer");
		
		mb.addcomponent(cpu);
		mb.addcomponent(ram);
		ph.addcomponent(mouse);
		ph.addcomponent(monitor);
		cabinet.addcomponent(hd);
		cabinet.addcomponent(mb);
		computer.addcomponent(ph);
		computer.addcomponent(cabinet);

		//ram.showprice();
		//ph.showprice();
		computer.showprice();
		// TODO Auto-generated method stub

	}

}
