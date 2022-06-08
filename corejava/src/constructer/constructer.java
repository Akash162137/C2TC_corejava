package constructer;


public class constructer {
	
	constructer()
	{
		System.out.println("Default constructor");
	}
	
	constructer(int i,int j)
	{
		System.out.println("Constructor with the two parameters");
	}
	
	constructer(int a, int b, int c)
	{
		System.out.println("Constructor with the three parameters");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructer e = new constructer();
		constructer ob = new constructer(1,2);
		constructer obj = new constructer(3,4,5);

	}

}