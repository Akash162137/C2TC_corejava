package overriding;
class A
{
	void name()
	{
		System.out.println("Akash");
	}
}
class B
{
	void name()
	{
		System.out.println("Rana");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A ob1=new A();
B ob2=new B();
ob1.name();
ob2.name();
	}

}
