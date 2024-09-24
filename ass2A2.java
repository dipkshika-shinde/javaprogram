package assignment2;
import java.util.*;
import java.io.*;

class Student
{
	int rno;
	String name;
	Double per;
	
	Student()// default constructor
	{
		
	}
	public void accept() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the roll no of student:");
		rno=Integer.parseInt(br.readLine());
		System.out.println("Enter the name of student:");
		name=br.readLine();
		System.out.println("Enter the percentage of student:");
		per=Double.parseDouble(br.readLine());
	}
	public static void sort(Student s[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(s[i].per>s[j].per)
				{
					Student s1=s[i];
					s[i]=s[j];
					s[j]=s1;
				}
			}
		}
		for(int i=0;i<n;i++) 
		{
			s[i].display();
		}
		
	}
	void display()
	{
		System.out.println(rno+"\t"+name+"\t"+per);
	}
}



public class ass2A2 {

	public static void main(String[] args) throws IOException
	{
		int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many objects are created ==>");
		n=Integer.parseInt(br.readLine());
		Student s[]=new Student[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new Student();
			s[i].accept();
		}
        Student.sort(s,n);
	}

}
