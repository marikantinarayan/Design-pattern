package com.Visitordesign.demo;

public interface Computerpartvisitor 
//step:3
{
 public void visit(Computer computer);
 public void visit(Mouse mouse);
 public void visit(Keyboard keyboard);
 public void visit(Monitor monitor);
 
}
