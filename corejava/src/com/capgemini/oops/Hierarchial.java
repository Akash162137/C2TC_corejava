package com.capgemini.oops;
class Bird
{
	void fly()
	{
		System.out.println("i can fly");
	}
}
class parrot extends Bird
{
	void color()
	{
		System.out.println("Blue");
	}
}
class crow extends Bird
{
	void color()
	{
		System.out.println("Black");
	}
}
public class Hierarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parrot ob1=new parrot();
crow ob2 = new crow();

ob1.color();
ob1.fly();
ob2.color();
ob2.fly();
	}

}
