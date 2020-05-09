package com.Strategydesign.demo;

public class StrategyDemo {
	//step:4

	public static void main(String[] args) {
		Context context=new Context(new OperationAdd());
		System.out.println("10 + 5= "+context.executestrategy(10, 5));
		 context=new Context(new OperationSubtract());
		System.out.println("10 -5 ="+context.executestrategy(10, 5));
		context=new Context(new OperationMultiply());
		System.out.println("10 *5="+context.executestrategy(10, 5));
				
		// TODO Auto-generated method stub

	}

}
