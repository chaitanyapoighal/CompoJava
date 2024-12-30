package com.compo;

public class BankAccount implements Cloneable {
	long acc_num;
	String name;

	public BankAccount(long acc_num, String name) {
		super();
		this.acc_num = acc_num;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	void accDetails() {
		System.out.println(acc_num + " " + name);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		BankAccount acc = new BankAccount(123456l, "Sam");
		BankAccount acc1 = (BankAccount) acc.clone();
		acc.accDetails();
		acc1.accDetails();
		System.out.println(acc==acc1);
	}

}
