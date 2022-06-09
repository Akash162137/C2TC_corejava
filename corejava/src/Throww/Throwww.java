package Throww;

public class Throwww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x =20;
int y = 0;
try
{
	int z=x/y;
	System.out.println("Result:"+z);
	throw new ArithmeticException();
}
catch(ArithmeticException ae)
{
	System.out.println("Exception Caught:\n");
	
}
	}

}
