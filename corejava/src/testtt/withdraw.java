package testtt;

 class withdraw {
int amt_withdraw=20000;
int amt_left=5000;
}
public class Machine extends withdraw
{
	int amt_left=5000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Machine ob1=new Machine();
System.out.println("amount withdraw"+ob1.amt_withdraw);
System.out.println("amount withdraw"+ob1.amt_left);
	}

}
