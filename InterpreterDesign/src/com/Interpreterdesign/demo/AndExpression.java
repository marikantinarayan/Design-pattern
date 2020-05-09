package com.Interpreterdesign.demo;

public class AndExpression  implements Expression
//step:2
{
	private Expression exp1=null;
	private Expression exp2=null;
	
	public AndExpression(Expression exp1, Expression exp2) {
		super();
		this.exp1 = exp1;
		this.exp2 = exp2;
	}


	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return exp1.interpret(context) && exp2.interpret(context);
	}
	

}
