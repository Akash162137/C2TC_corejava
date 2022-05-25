package ghi;
class Superclass
{
	void methodsuper()
	{
		System.out.println("I am super class");
	}
}
class Subclass extends Superclass {
	void methodSubclass()
	{
	System.out.println("I am sub clas method");
	}
}
 class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Subclass a=new Subclass();
a.methodsuper();
a.methodSubclass();
	}
}


