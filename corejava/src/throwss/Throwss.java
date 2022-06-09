
package throwss;
import java.io.IOException;
public class Throwss {

	static void display() throws IOException
	{

	System.out.println("Hello Java"); throw new IOException();}

	 public static void main(String[] args) 
	 { Throwss  obj = new Throwss ();

	try {

	obj.display();

	}

	catch (IOException e) { System.out.println("Caught an exception: \n" +e);

	}

	 }
}
