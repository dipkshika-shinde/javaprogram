package assignment1;
import java.util.*;
public class ass1B3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows and column:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int cc[][]=new int[r][c];
		int ch;
		System.out.println("Enter the element of  matrix A :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			
			{
				a[i][j]=sc.nextInt();
			}	
		}
		System.out.println("Accept element of  matrix A :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			
			{
				System.out.print(a[i][j]+"\t");
			}
				System.out.println();
		}
		
		System.out.println("Enter the element of  matrix B :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			
			{
				b[i][j]=sc.nextInt();
			}
				
		}
		System.out.println("accept the element of  matrix B :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			
			{
				System.out.print(b[i][j]+"\t");
			}
				System.out.println();
		}
		do
		{
        System.out.println("MENU");
        System.out.println("\n1.Addition");
        System.out.println("\n2.Multiplication");
        System.out.println("\n3.transpose");
        System.out.println("\n4.exit");
 
        System.out.println("Enter your choice:");
        ch=sc.nextInt();
        
        switch(ch)
        {
    case 1: System.out.println("Addition of two matrices:");
                for( int i=0;i<r;i++) 
                {
                	for( int j=0;j<c;j++)
                	{
                		cc[i][j]=a[i][j]+b[i][j];
                	}
                }
                for( int i=0;i<r;i++) 
                {
                	for( int j=0;j<c;j++)
                	{
                		System.out.println(" "+cc[i][j]);
                	}
                	System.out.println(" ");
                }
                break;
                
   case 2: System.out.println("Multiplication  of two matrices:");
        for( int i=0;i<r;i++) 
        {
        	for( int j=0;j<c;j++)
        	{  
        		cc[i][j]=0;
        		for( int k=0;k<r;k++) 
        		{
        			cc[i][j]=cc[i][j]+a[i][k]*b[k][j];
        		}
        	}
        		
        	}
        for( int i=0;i<r;i++) 
        {
        	for( int j=0;j<c;j++)
        	{
        		System.out.print(" "+cc[i][j]);
        	}
        	System.out.println(" ");
        }
        break;
        
   case 3:System.out.println("transpose of two matrices A:");
           for( int i=0;i<r;i++) 
           {
      	    for( int j=0;j<c;j++)
        	{
      	    	System.out.print(" "+a[j][i]);
   	        }
      	    System.out.println();
           }
            break;
            
   case 4:break;
        }
		}while(ch<4);
	}
		
}
       
        		
        	
        		
        	
      
		
		

