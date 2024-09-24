package assignment1;

import java.util.Scanner;

public class assignment1c {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int q=0;
		do
		{
			System.out.println("MENU:");
			System.out.println("\n1.volume \n2.factorial \n3.Armstrong \n4.exit");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter the radius:");
			        float  rad=sc.nextInt();
			        System.out.println("Enter the Height:");
			        float  h=sc.nextInt();
			        double v=3.14*(rad*rad)*h;
			        System.out.println("Volume od cylinder is::"+v);
			        break;
			        
			case 2:System.out.println("Enter the number:");
			       int n=sc.nextInt();
			       int fact=1;
			       for(int i=1;i<=n;i++)
			       {
			    	   fact=fact*i;
			       }
			       System.out.println("factorial of given number is:"+fact);
			       break;
			       
			case 3:int num,r,sum=0,temp;
				   System.out.println("Enter the number:");   
				   num=sc.nextInt();
				   temp=num;
				   while(num>0)
				   {
					   r=num%10;
					   sum=sum+(r*r*r);
					   num=num/10;
							   
				   }
				   if(temp==sum)
				  System.out.println("given number is Armstrong:");
				   else
				  System.out.println("given number is not Armstrong:");
				   break;
				   
			case 4:q=1;
			       break;
			}
		}while(q==0);
	}

}
