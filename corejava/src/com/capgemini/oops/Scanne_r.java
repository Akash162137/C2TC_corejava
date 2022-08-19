package com.capgemini.oops;
import java.util.*;
public class Scanne_r {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		/*System.out.println("Enter your name");
		String n =scan.nextLine();
		System.out.println("The name is"+" "+n);
		System.out.println("Enter the Character");
		char c = scan.next().charAt(3);                            //to find character at 0 index
		System.out.println("char at 3rd position is ="+c);*/
		System.out.println("Enter an integer");
		boolean b=scan.hasNextInt();
	    System.out.println("you entered integer "+" "+b);	
	}

}
