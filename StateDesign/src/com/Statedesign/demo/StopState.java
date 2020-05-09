package com.Statedesign.demo;

public class StopState implements State
//step:2
{
	@Override
	public void doAction(Context context) {
		System.out.println("Player is in stoptstae");
		context.setState(this);
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "StopState";
	}
	

}
