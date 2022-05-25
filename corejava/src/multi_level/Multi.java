package multi_level;
class Akash
{
	void hobby()
	{
		System.out.println("Business");
	}
}
class Rana extends Akash
{
	void art()
	{
		System.out.println("Youtube");
	}
}
class Raj extends Rana
{
	void talent()
	{
		System.out.println("Computer");
	}
}
public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Raj obj=new Raj();
obj.talent();
obj.art();
obj.art();
obj.hobby();
	}

}
