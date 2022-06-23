package com.capgemini.program.threads;
import java.lang.*;
public class Extendthread implements Runnable{
	
public void run()
{
	System.out.println("Hi Akash");

System.out.println(Thread.currentThread());
System.out.println(Thread.currentThread());

for(int i=1;i<=8;i++)
{
	System.out.println(i);
}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Extendthread ob1=new Extendthread();
Thread an = new Thread(ob1);
an.start();
an.setName("King");
an.setName("Queen");
	}

}
