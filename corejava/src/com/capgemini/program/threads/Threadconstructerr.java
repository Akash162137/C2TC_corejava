package com.capgemini.program.threads;

public class Threadconstructerr implements Runnable{
	public void run()
	{
		System.out.println("Hello");
	
	
	try
	{
		Thread.sleep(3000);
	}
	catch(InterruptedException ie)
	{
		System.out.println(ie.getMessage());
	}System.out.println("Java");
	System.out.println(Thread.currentThread());
	}
	void m1()
	{
		System.out.println("M1 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadconstructerr a=new Threadconstructerr();
		Thread ob1 =new Thread(a);
		ob1.start();
		System.out.println("number of active threads:"+Thread.activeCount());
		a.m1();
		
	}

}
