package com.Strategydesign.demo;

public class OperationAdd implements Strategy
//step:2
{

	@Override
	public int doOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

}
