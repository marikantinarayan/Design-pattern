package com.Proxydesign.demo;

public class ProxyDemo {
	//step:3

	public static void main(String[] args) {
		Image image=new proxyimage("Test_20mb.jpg");
				image.display();
                System.out.println("");	
                image.display();
		// TODO Auto-generated method stub

	}

}
