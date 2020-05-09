package com.Observerdesign.demo;

public class ObserverDemo {

	public static void main(String[] args) {
		Subject subject=new Subject();
		Observer observer=new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
		subject.deattach(observer);
		System.out.println("Third state change: 10");
		subject.setState(5);
		

		// TODO Auto-generated method stub

	}

}
