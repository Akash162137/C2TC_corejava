package com.capgemini.oops;
class A
{
	void method()
	{
		System.out.println("I am class A");
	}
}
class B
{
	void method()
	{
		System.out.println("I am class B");
	}
}
class C extends A                                                //Not possible to inherit 2 classes
{
	void method()
	{
	System.out.println("I am class C");	
	}
}
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C ob1 =new C();
ob1.method();
	}

}
