package overloading;
class Calculator
{
	void Akash(int i)
	{
		System.out.println("The square of number "+i +"is"+i*i );
	}
	void Akash(char c)
	{
		System.out.println(c+ "These is the character");
	}
	void Akash(float f)
	{
		System.out.println("Square of the float"+f +"is" +f*f);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator ob1=new Calculator();
ob1.Akash(55);
//ob1.Akash(22);
ob1.Akash('c');
ob1.Akash(2.4f);

	}

}
