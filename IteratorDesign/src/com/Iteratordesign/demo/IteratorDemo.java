package com.Iteratordesign.demo;

public class IteratorDemo {

	public static void main(String[] args) {
		//step:3
		NameRepository namerepository=new NameRepository();
		for (Iterator iter = namerepository.getiterator();iter.hasNext();)
		{
			String name=(String)iter.next();
			System.out.println("Name :"+name);
		}
		// TODO Auto-generated method stub

	}

}
