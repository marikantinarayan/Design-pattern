package com.Observerdesign.demo;

public class OctalObserver extends Observer
//step:3
{
	public OctalObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}


	@Override
	public void Update() {
		System.out.println("Octal string :"+Integer.toOctalString(subject.getState()));
		// TODO Auto-generated method stub
		
	}

}
