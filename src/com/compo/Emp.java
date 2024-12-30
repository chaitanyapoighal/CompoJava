package com.compo;

public class Emp implements Cloneable {
	int emp_id;
	int salary;
	public Emp(int emp_id, int salary) {
		super();
		this.emp_id = emp_id;
		this.salary = salary;
	}
	
	protected Emp clone() throws CloneNotSupportedException {
		Emp emp=(Emp)super.clone();
		return emp;
	}
	public static void main(String args[]) throws CloneNotSupportedException {
		Emp emp=new Emp(1234,45000);
		Emp emp1=emp.clone();
		System.out.println(emp1==emp);
		System.out.println(emp1.equals(emp));
		
	}

}
