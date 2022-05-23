package encapsulation;

public class Threadpg {
	int year_of_pub;
	String make;
	int model;
	double cost;

	 public void disp1()
	{
	System.out.println("year of purchase"+2001);
	System.out.println("make"+"suzuki");
	}
	 public void disp2()
	 {
		 System.out.println("model"+1999);
		 System.out.println("cost"+25000.60);
	 }
	public static void main(String[] args) {
 Threadpg ob=new Threadpg();
 ob.disp1();
 ob.disp2();
}
}


	
	