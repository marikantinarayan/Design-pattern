package com.Observerdesign.demo;

public class HexaObserver extends Observer
//step:3
{
	public HexaObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}

	@Override
	public void Update() {
		System.out.println("Hexa string :"+Integer.toHexString(subject.getState()));
		// TODO Auto-generated method stub
		
	}


}
