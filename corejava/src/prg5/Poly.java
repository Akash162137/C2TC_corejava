package prg5;

public class Poly {
 void add(int x,int y)
 {
	 System.out.println("addition of two numbers"+(x+y));
 }
 void add(int x,int y,int z)
 {
	 System.out.println("addition of three numbers"+(x+y+z));
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Poly obj1=new Poly();
obj1.add(2,4);
obj1.add(5,6,7);
	}

}
