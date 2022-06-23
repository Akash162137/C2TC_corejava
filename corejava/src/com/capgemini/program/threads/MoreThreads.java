package com.capgemini.program.threads;
import java.lang.*;
public class MoreThreads extends Thread {
public void run()
{
	System.out.println("Thread is"+" "+Thread.currentThread()+"is running");
	System.out.println("Threads are"+" "+Thread.currentThread().getName());
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoreThreads a1 =new MoreThreads();
		MoreThreads a2 =new MoreThreads();
		MoreThreads a3 =new MoreThreads();
		a1.setPriority(MAX_PRIORITY);
		a2.setPriority(MIN_PRIORITY);
		a3.setPriority(7);
		a1.start();
		a2.start();
		a3.start();
	}

}
