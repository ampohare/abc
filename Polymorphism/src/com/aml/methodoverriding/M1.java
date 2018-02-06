package com.aml.methodoverriding;

public class M1 extends M {
       void show() {
    	   System.out.println("this is child class show method");
       }
	 void display() {
		 System.out.println("this is child class display method");
	 }
	public static void main(String[] args) {
		M1 m=new M1();
		m.show();
		m.display();
		M m1=new M1();
		m1.show();
		m1.display();
		m1.m();
		M m2=new M();
		m2.show();
		m2.display();
		m2.m();
	}
}
