package staticc;



public class Staticcc {
static	int count=0;
	
Staticcc()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1 ;i<=3;i++) {
			Staticcc c1=new Staticcc();}
		Staticcc c2=new Staticcc();
		Staticcc c3=new Staticcc();
	}

}