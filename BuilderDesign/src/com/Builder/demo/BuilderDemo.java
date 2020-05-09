package com.Builder.demo;

public class BuilderDemo 
{
	//step :7
	public static void main(String[] args) {
		MealBuilder mb=new MealBuilder();
		Meal vegmeal=mb.preparevegmeal();
		System.out.println("veg meal");
		vegmeal.showitem();
		System.out.println("Total cost"+vegmeal.getcost());
		Meal nonvegmeal=mb.preparenonvegmeal();
		System.out.println("\n\nNon-veg meal");
		nonvegmeal.showitem();
		System.out.println("Total cost:"+nonvegmeal.getcost());
	}

}
