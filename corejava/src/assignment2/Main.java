package assignment2;
import java.util.*;
class library
{
	int acc_num;
	String Title;
	String Author;
	Scanner scan=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the acc_number");
		int acc_num=scan.nextInt();
		System.out.print("Enter the Title");
		String Title=scan.nextLine();
		System.out.println("Enter the Author");
		String Author=scan.nextLine();	
	}
	void compute()
	{
		System.out.println("Enter the days late");
		int d=scan.nextInt();
		int fine=(d*5);
	}
	void display()
	{
		System.out.println("Accession Number"+" "+" "+" "+"Title"+" "+" "+" "+"Author");
	}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
library ob1=new library();
ob1.input();
ob1.compute();
ob1.display();
	}
}
}
