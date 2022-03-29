package org.info;

public class ComDetails {
public void companyname() {
System.out.println("My company Information");	
}
public  void companyname(String n) {
System.out.println("Company name is "+n);		
}	
public  void companyname(int i) {
System.out.println("company id is"+i);	
}
	
public  void companyname(int pin,String c) {
System.out.println("company pincode is "+pin);	
System.out.println("company city is "+c);
}
public  void companyname(long mob,String email) {
System.out.println("company email is "+email);
System.out.println("company mobile is  "+mob);
}
public static void main(String[] args) {
ComDetails c=new ComDetails ();
	c.companyname("ABC");

c.companyname(100);
c.companyname(623521,"chennai");
c.companyname(9500040894l, "ABC@gmail.com");

}	
}	
	
	
	




	


