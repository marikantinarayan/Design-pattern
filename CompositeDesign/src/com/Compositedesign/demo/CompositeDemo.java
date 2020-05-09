package com.Compositedesign.demo;

public class CompositeDemo 
{//step :2
	public static void main(String[] args) {
		Employee CEO=new Employee("john", "CEO", 30000);
		Employee headsales=new Employee("nari", "headsales", 20000);
		Employee headmarket=new Employee("naresh", "headmarket", 20000);
		Employee clerk1=new Employee("tiru", "market", 30000);
		Employee clerk2=new Employee("arnav", "market", 30000);
		Employee sales=new Employee("nn", "sales", 10000);
		Employee sales2=new Employee("joh", "sales2", 10000);
		CEO.add(headsales);
		CEO.add(headmarket);
		headsales.add(sales);
		headsales.add(sales2);
		headmarket.add(clerk1);
		headmarket.add(clerk2);
		System.out.println(CEO);
		for (Employee headEmployee : CEO.getsub()) {
			System.out.println(headEmployee);
			for (Employee employee : headEmployee.getsub()) {
				System.out.println(employee);
				
			}
			
		}
		
	}

}
