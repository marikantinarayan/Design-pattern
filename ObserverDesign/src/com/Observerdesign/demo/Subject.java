package com.Observerdesign.demo;

import java.util.ArrayList;
import java.util.List;

public class Subject
//step:1
{
	private List<Observer>observerlis=new ArrayList<Observer>();

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		
		this.state = state;
		notifyallObservers();
		
	}
	public void attach(Observer observer) {
		observerlis.add(observer);
		
	}
	public void deattach(Observer observer) {
		observerlis.remove(observer);
		
	}
	public void notifyallObservers() {
		for (Observer observers : observerlis)
		{
			observers.Update();
		}
		
	}

}
