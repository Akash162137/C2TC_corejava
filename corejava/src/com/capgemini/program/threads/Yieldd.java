package com.capgemini.program.threads;

public class Yieldd implements Runnable{
public void run()
{
	System.out.println(Thread.currentThread());
	Thread.yield();
	System.out.println(Thread.currentThread());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yieldd a = new Yieldd();
		Thread t1=new Thread(a);
		
		Yieldd b=new Yieldd();
		Thread t2=new Thread(b);
		
		t1.start();
		t2.start();
	}

}
