package variable;
class Akash
{
	int a=150;
}
class Raj extends Akash
{
	int a=250;
void display()
{
	System.out.println("The number is:"+a);
	System.out.println("The number is:"+super.a);
}
}
public class Variables 
{
public static void main(String[]args) 
{
	Raj c=new Raj();
	c.display();
}
}
