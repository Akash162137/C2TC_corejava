package com.capgemini.programming.homework;
import java.util.*;
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> arr =new LinkedList<Integer>();
for(int i=1;i<=5;i++)
arr.add(i);
{
	System.out.println("The list is"+arr);
}
arr.remove(3);
System.out.println("The list after removing third index is"+arr);
for(int i=0;i<arr.size();i++)
{System.out.println(arr.get(i)+" ");
	}
arr.set(1,121);
System.out.println("The index replaced at 3 is"+arr);
arr.add(1,125);
System.out.println("The added position is"+arr);
arr.indexOf(125);
System.out.println("index of 3 is"+arr);
	}
}
