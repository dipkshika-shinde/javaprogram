package assignment2;
import java.io.*;
import java.util.*;


 class Cricketplayer
{
	String name;
	int noofin,noofnotout,totalruns;
	float batavg;

	public Cricketplayer()
	{
		name="";
		noofin=0;
		noofnotout=0;
		totalruns=0;
		batavg=0;
	}
void accept()   throws IOException
{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("enter the name:");
	  name=br.readLine();
	  System.out.println("enter the number of Inning:");
	 noofin=Integer.parseInt(br.readLine());
	  System.out.println("enter the number of times not out:");
	  noofnotout=Integer.parseInt(br.readLine());
	  System.out.println("enter the total runs:");
	  totalruns=Integer.parseInt(br.readLine());
}
void display()
{
	System.out.println("The name="+name);
	System.out.println("Number of Inning="+noofin);
	System.out.println("number of times not out="+noofnotout);
	System.out.println("Total runs="+totalruns);
	System.out.println("bating average="+batavg);
	
}
static void avg(int n,Cricketplayer a[])
{
	 try 
	 {
		 for(int i=0;i<n;i++)
		 {
			 a[i].batavg=a[i].totalruns/a[i].noofin;
		 }
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("Average operation is invalid");
	 }
}
static void sortplayer(int n,  Cricketplayer a[])
{
	String temp;
	int temp1,temp2,temp3;
	float temp4;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i].batavg>a[i].batavg)
			{
				temp=a[i].name;
				a[i].name=a[j].name;
				a[j].name=temp;
				
				temp1=a[i].noofin;
				a[i].noofin=a[j].noofin;
				a[j].noofin=temp1;
				
				temp2=a[i].noofnotout;
				a[i].noofnotout=a[j].noofnotout;
				a[j].noofnotout=temp2;
				
				temp3=a[i].totalruns;
				a[i].totalruns=a[j].totalruns;
				a[j].totalruns=temp3;
				
				temp4=a[i].batavg;
				a[i].batavg=a[j].batavg;
				a[j].batavg=temp4;
				
			}
		}
	}
}
}
 
 public class ass2B2
 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the limit");
        int n=Integer.parseInt(br.readLine());
        
        Cricketplayer a[]=new Cricketplayer[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=new Cricketplayer();
        	a[i].accept();
        }
        	Cricketplayer.avg(n, a);
        	Cricketplayer.sortplayer(n, a);
        	
        	for(int i=0;i<n;i++)
        	{
        		a[i].display();
        	}
        	
        }
	}
 

