package assignment2;
import java.util.Scanner;
import java.util.*;

class Person
{
	String first,middle,last;
	int len;
void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first name:");
	first=sc.next();
	System.out.println("Enter middle name:");
	middle=sc.next();
	System.out.println("Enter last name:");
	last=sc.next();
	len=middle.length();
	String fs=middle.substring(0,1);
	String ls=middle.substring(1,len);
	fs=fs.toUpperCase();
	middle=fs+ls;
}
void display()
{
	StringBuffer fullname=new StringBuffer();
	fullname.append(last);
	fullname.append(" ");
	fullname.append(first);
	fullname.append(" ");
	fullname.append(middle);
	fullname.append(" ");
	System.out.println("full name is:"+fullname);
}
}

public class ass2A4
{
   public static void main(String args[])
   {
	 Person p=new Person();
	p.accept();
	p.display();
   }
}
