package com.Strategydesign.demo;

public class Context
//step:3
{
	private Strategy strategy ;
	public Context(Strategy strategy) {
		this.strategy=strategy;
		
	}
	public int executestrategy(int num1,int num2) {
		return strategy.doOperation(num1, num2);
	}

}
