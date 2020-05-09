package com.Statedesign.demo;

public class StateDemo 
//step :4
{
	public static void main(String[] args) {
		Context context=new Context();
		StartSate startsate=new StartSate();
		startsate.doAction(context);
		System.out.println(context.getState().toString());
		StopState stopstate=new StopState();
		stopstate.doAction(context);
		System.out.println(context.getState().toString());
	}

}
