package Scanner;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter your name");
String a=scan.nextLine();
System.out.println("name is" + a);
System.out.println("Enter your Id");
int b=scan.nextInt();
System.out.println("Id is" + b);
System.out.println("Enter your marks");
Float c=scan.nextFloat();
System.out.println("marks is" + c);

System.out.println("name is" + a + "Id is" + b + "marks is" + c );
}

}
