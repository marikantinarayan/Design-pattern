package com.Mementodesign.demo;

public class Originator
//step:2
{
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public Memento SavestateTomemento() {
		return new Memento(state);
	}
	public void  getstatefrommemento(Memento memento) {
		state=memento.getState();
		
	}

}
