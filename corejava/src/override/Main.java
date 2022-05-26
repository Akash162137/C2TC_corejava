package override;
class Akash
{
	void eat()
	{
		System.out.println("Biriyani");
	}
}
class Rana extends Akash
{
	void eat()
	{
		System.out.println("Kabab");
	}
}
public class Main {
	public static void main(String[] args) {
		Akash ob1=new Akash();
		Rana ob2=new Rana();
		ob1.eat();
		ob2.eat();
	}
}
