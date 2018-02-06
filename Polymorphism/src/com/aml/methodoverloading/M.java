package com.aml.methodoverloading;

public class M extends MethodOverLoading{

	void m1(char c) {
		char z=c;
		System.out.println(z);
	}
	public static void main(String[] args) {
		
		M m=new M();
		m.m1('M');
		m.m1();
		m.m1(04);
	}
}
