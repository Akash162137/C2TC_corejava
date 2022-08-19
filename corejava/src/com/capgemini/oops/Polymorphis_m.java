package com.capgemini.oops;

public class Polymorphis_m {
	void sub(int a,int b) {
		System.out.println("substraction of two numbers is"+" "+(a-b));
	}
	void sub(int a,int b,int c)
	{
		System.out.println("substraction of three numbers is"+" "+(a-b-c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphis_m ob1=new Polymorphis_m();
		ob1.sub(23,14);
		ob1.sub(24, 65, 34);
	}

}
