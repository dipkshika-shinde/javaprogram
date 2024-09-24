package assignment2;
import java.io.*;
import java.util.*;

public class ass2A3 {

	public static void main(String[] args)  throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		System.out.println("Unsorted elements are:");
		for(int i=0;i<args.length;i++)
		{
			System.out.println(""+a[i]);
		}
		//Arrays.sort(a);
		for(int i=0;i<args.length;i++)
		{
			for(int j=i+1;j<args.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//System.out.println(""+a[i])
	System.out.println("sorted elements are:");
	for(int i=0;i<args.length;i++)
	{
		System.out.println(""+a[i]);
	}

	}
}
