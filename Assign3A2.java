package assignment3;

import  java.util.Scanner;

abstract class Staff
{
	protected int id;
	protected String name;
	Staff(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
}

class OfficeStaff extends Staff
{
	String dept;
	public OfficeStaff (int id,String name,String dept)
	{
		super(id,name);
		this.dept=dept;
		
	}
	void display()
	{
		System.out.println(id+""+name+" "+dept);
	}
}
public class Assign3A2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many obj u create");
		int n=sc.nextInt();
		OfficeStaff os[]=new OfficeStaff[n];
		for (int i=0;i<n;i++)
		{
			System.out.println("pls enter the id");
			int id=sc.nextInt();
			
			System.out.println("enter name");
			String name=sc.next();
			
			System.out.println("pls enter the dept");
			String dept=sc.next();
			os[i]=new OfficeStaff(id,name,dept);
//			os[i].display();
		}
		for(int j=0;j<n;j++)
		{
			os[j].display();
		}
		

	}

}
