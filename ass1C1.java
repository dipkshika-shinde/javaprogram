package assignment1;
import java.util.*;


public class ass1C1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many countries you want to insert in array:");
		int n=sc.nextInt();
		String a[]=new String[n];
		System.out.println("Enter countries name:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("Names of countries in asesending order:");
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
			
		}
		System.out.println("Names of countries in descending order:");
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		}
		

    }
