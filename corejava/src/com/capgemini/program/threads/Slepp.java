package com.capgemini.program.threads;

public class Slepp implements Runnable {
public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);}
		System.out.println("Akash");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Slepp a = new Slepp();
Thread ob1= new Thread(a);
ob1.start();

try {
	ob1.join();
}
catch(InterruptedException ie)
{
	ie.printStackTrace();
}
System.out.println("last word");
	}

}
