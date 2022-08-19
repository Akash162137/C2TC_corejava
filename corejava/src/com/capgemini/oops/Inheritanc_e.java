package com.capgemini.oops;
class student
 {
	 int id;
	 String name;
	 double per;
	 void Input()
	 {
		 System.out.println("id,name,per");
	 }
 }
 public class Inheritanc_e extends student               // Always create Subclass name as Main class Name
 {
	 void display()
	 {
		 id=003;
		 name="Akash"; per=75.7;
		 System.out.println(+id +" "+name+""+per);
	 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Inheritanc_e ob1=new Inheritanc_e();
	ob1.display();
	ob1.Input();
	
		}

	}
