package assignment1;
 import java.util.*;
public class ass1A4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many Values:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter actual values:");
		for( int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are:");
		for( int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("reversed array elements are:");
		for( int i=n-1;i>0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
