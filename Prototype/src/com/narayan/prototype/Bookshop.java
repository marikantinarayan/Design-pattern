package com.narayan.prototype;

import java.util.ArrayList;
import java.util.List;


public class Bookshop implements Cloneable
{
	private String shopname;
	
	List<Book>book=new ArrayList<>();

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
 public void loaddata()
 {
	 for (int i = 1; i <= 10; i++)
	 {
		 // data base connections :
		Book b=new Book();
		b.setBid(i);
		b.setBname("book"+i);
		getBook().add(b);
		
	}
 }
	@Override
	public String toString() {
		return "Bookshop [shopname=" + shopname + ", book=" + book + "]";
	}

	@Override
	protected Bookshop clone() throws CloneNotSupportedException 
	{
		Bookshop shop=new Bookshop();
		for (Book b : this.getBook()) {
			shop.getBook().add(b);
			
		}
		// TODO Auto-generated method stub
			return shop;
	}
	
	
	

}
