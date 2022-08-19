package com.capgemini.oops;
class X
{
	int var=100;
}
class Y  extends X
{
	int var=350;
	void display()
	{
		System.out.println("The child value is"+" "+var);
		System.out.println("The parent value is"+""+super.var);
	}
}
public class Supe_r{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Y ob1=new Y();
ob1.display();

	}

}
