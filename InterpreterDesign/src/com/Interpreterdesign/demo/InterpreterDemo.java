package com.Interpreterdesign.demo;

public class InterpreterDemo {
	//step:3
	public static Expression getmaleexpression() {
		Expression robet=new TerminalExpression("Robet");
		Expression jhon=new TerminalExpression("John");
		return new OrExpression(robet, jhon);
	}
	public static Expression getmarrieexpression() {
		Expression julie=new TerminalExpression("Julie");
		Expression married=new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {
		Expression ismale=getmaleexpression();
		Expression ismarried=getmarrieexpression();
		System.out.println("John is male?"+ismale.interpret("John"));
		System.out.println("Julie is married Woman?"+ ismarried.interpret("Married Julie"));
		// TODO Auto-generated method stub

	}

}
