package assignment1;
import java.util.*;


public class ass1C2 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int ch,sum1=0,sum2=0,sum3=0;
		System.out.println("Enter the array element for matrix A");
		for(int i=0;i<r;i++)
		{
			for( int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the array element for matrix A");
		for(int i=0;i<r;i++)
		{
			for( int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		do 
		{
		   System.out.println("\n1.Sum of diagonal element:");	
		   System.out.println("\n2.Sum of  upper diagonal element:");	
		   System.out.println("\n3.Sum of lower diagonal element:");	
		   System.out.println("\n4.exit:");	
		   System.out.println("Enter you choice");
		   ch=sc.nextInt();
		   switch(ch)
		   {
		   case 1: System.out.println("sum of diagonal element:");
		          for(int i=0;i<r;i++)
		          {
		        	  for(int j=0;j<c;j++)
		        	  {
		        		  if(i==j)
		        		  {
		        			  sum1=sum1+a[i][j];
		        		  }
		        	  }
		          }
		        	  System.out.println("sum of diagonal element:"+sum1);
		          break;
		          
		   case 2: System.out.println("sum of upper diagonal element:");
	          for(int i=0;i<r;i++)
	          {
	        	  for(int j=0;j<c;j++)
	        	  {
	        		  if(i<j)
	        		  {
	        			  sum2=sum2+a[i][j];
	        		  }
	        	  }
	          }
	          System.out.println("sum of upper diagonal element:"+sum2);
	          break;
	          
		   case 3: System.out.println("sum of diagonal element:");
	          for(int i=0;i<r;i++)
	          {
	        	  for(int j=0;j<c;j++)
	        	  {
	        		  if(i>j)
	        		  {
	        			  sum3=sum3+a[i][j];
	        		  }
	        	  }
	          }
	          System.out.println("sum of lower diagonal element:"+sum3);
	          break;
	          
		   case 4:break;
		          
		   }
		   
		}while(ch<4);
		

	}

}
