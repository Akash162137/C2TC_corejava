package hiearchial;
class Akash
{
	void eat()
	{
		System.out.println("Biriyani");
	}
}
class Rana extends Akash
{
	void sing()
	{
		System.out.println("Ra Ra");
	}
}
class Raj extends Akash
{
	void sing()
	{
		System.out.println("Hiphop");
	}
}
public class King {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rana ob1=new Rana();
Raj ob2=new Raj();
ob1.eat();
ob1.sing();
ob2.sing();
ob2.eat();
	}

}
