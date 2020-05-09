package com.Observerdesign.demo;

public class BinaryObserver  extends Observer
//step:3
{
	public BinaryObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}

	@Override
	public void Update() {
		System.out.println("Binary string :"+Integer.toBinaryString(subject.getState()));
		// TODO Auto-generated method stub
		
	}
	

}
