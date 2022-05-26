package assignment1;
class Calculate{
	void volume(int s)
	{
		System.out.println("The Volume of Cube "+s+" " +"is"+" "+s*s*s);
	}
	void volume(int l,int b,int h)
	{
		System.out.println("The Volume of cuboid is" +" "+l*b*h);
	}
	void volume(float r)
	{
		System.out.println("The volume of sphere"+" "+4/3*3.14*r*r*r);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculate ob1=new Calculate();
ob1.volume(5);
ob1.volume(1.8f);
ob1.volume(1,2,3);
	}

}
