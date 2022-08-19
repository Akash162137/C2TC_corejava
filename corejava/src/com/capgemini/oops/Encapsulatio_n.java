package com.capgemini.oops;

public class Encapsulatio_n {
 int model;
 String name;
 String Color;
 Float Milage;
 
 void External()
 {
	 System.out.println("The car model is"+" "+" = "+2001);
	 System.out.println("The name of car is"+" "+" = "+"Polo");
 }
 void Internal()
 {
	 System.out.println("The average milage is"+" "+" = "+22.3);
	 System.out.println("The Color of car is "+" "+" = "+"Black");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encapsulatio_n ob1=new Encapsulatio_n();
ob1.External();
ob1.Internal();
	}

}
