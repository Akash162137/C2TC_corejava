package assessment2;
import java.util.Scanner;

class library
{
	int acc_num;
	String Title;
	String Author;
	Scanner scan=new Scanner(System.in);
	void input()
	{
		{System.out.println("Enter the Author");
		 Author=scan.nextLine();}	
		{System.out.println("Enter the Title");
		 Title=scan.nextLine();}
		{System.out.println("Enter the acc_number");
		 acc_num=scan.nextInt();}
		
	}
	void compute()
	{
		System.out.println("Enter the days late");
		int d=scan.nextInt();
		int fine=(d*5);
		System.out.println("the fine charged is=Rupees"+fine);
	}
	void display()
	{
		System.out.println("Accession Number"+" "+" "+" "+"Title"+" "+" "+" "+"Author");
		System.out.println(+acc_num +"\t "+"\t "+" "+" "+Title+" "+" "+" "+Author);
	}
public class Boss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
library ob1=new library();
ob1.input();
ob1.compute();
ob1.display();
	}
}
}

