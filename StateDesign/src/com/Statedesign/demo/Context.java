package com.Statedesign.demo;

public class Context 
//step:3
{
	private State state;
	public Context() {
		state=null;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	

}
