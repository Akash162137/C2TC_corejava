package com.capgemini.oops;
class car
{
	void color()
	{
		System.out.println("black");
	}
}
class swift extends car
{
	void speeed()
	{
		System.out.println("hundred");
	}
}
class polo extends swift
{
	void brake()
	{
		System.out.println("very fast");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
polo ob1=new polo();
ob1.brake();
ob1.color();
ob1.speeed();
	}

}
