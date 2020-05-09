package com.Mementodesign.demo;

import java.util.ArrayList;
import java.util.List;

public class CareTaker 
//step:3
{
	private List<Memento>mementolist=new ArrayList<Memento>();
	public void add(Memento state) {
		mementolist.add(state);
	}
	public Memento get(int index) {
		return mementolist.get(index);
	}

}
