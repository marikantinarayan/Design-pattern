package com.Compositedesign.demo;

import java.util.ArrayList;
import java.util.List;

public class Employee
{
	//step:1
	private String name;
	private String dept;
	private int salary;
	private List<Employee>sub;
	
	public Employee(String name, String dept, int salary)
	{
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		sub=new ArrayList<Employee>();
	}
 public void add(Employee e) {
	 sub.add(e);
 }
 public void remove(Employee e) {
	 sub.remove(e);
 }
 public List<Employee>getsub(){
	 return sub;
 }
@Override
public String toString() {
	return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
}
 
}
