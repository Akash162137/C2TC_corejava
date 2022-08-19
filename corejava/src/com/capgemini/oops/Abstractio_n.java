package com.capgemini.oops;
abstract class atm
{
	abstract void withdraw();
}
public class Abstractio_n extends atm
{
	void withdraw()
	{
		System.out.println("Amount withdraw successful");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractio_n ob1 = new Abstractio_n();
		ob1.withdraw();
	}

	}


