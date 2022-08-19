package com.capgemini.oops;
import java.io.*;
import java.io.BufferedReader;
import java.util.*;
public class Buffer {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br =new BufferedReader(r);
System.out.println("Enter your name");
String s = br.readLine();
System.out.println("Hello"+" "+s+" "+"welcome");
	}

}
