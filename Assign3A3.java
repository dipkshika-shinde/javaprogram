package assignment3;

import java.util.Scanner;

interface Operation
{
	void area();
	void volume();
	double PI=3.142;
	
}
class Cylinder implements Operation
{
	float r,h;
	public void Accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius and height");
		r=sc.nextFloat();
		h=sc.nextFloat();
		
	}
	
 public	void area()
	{
		double al=(2*PI*(r*h));
		System.out.println("Area of cyclinder: "+al);
	}
 
 public void volume()
 {
	 double vol=(PI*r*r*h);
	 System.out.println("volume of cyclinder :"+ vol);
 }
}

public class Assign3A3 {

	public static void main(String[] args) 
	{
		Cylinder cl=new Cylinder();
		cl.Accept();
		cl.area();
		cl.volume();
		

	}

}
