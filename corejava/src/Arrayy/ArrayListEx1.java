package Arrayy;
import java.util.*;
public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list=new ArrayList<String>();
System.out.println("Adding elements to end of list");
list.add("A");
list.add("B");
list.add("D");
list.add("A");
list.add("G");
System.out.println("ArrayList Insertion order:"+list);
System.out.println("Adding element at index B element");
list.add(2,"C");
System.out.println("Array list after adding c is "+list);
System.out.println("After removing E from list is");
list.remove("A");
list.remove("A");
System.out.println("array after removing is"+list);
	}

}
