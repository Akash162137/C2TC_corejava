package thro_w;

public class ThrowTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	ArithmeticException a=new ArithmeticException("Hello from throw");
	throw a;
}
catch(ArithmeticException ae)	{
	System.out.println("AirthmeicException caught:\n+ae");
	System.out.println(ae.getMessage());
	}
}

}
