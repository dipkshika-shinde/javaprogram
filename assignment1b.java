package assignment1;

import java.util.Scanner;

public class assignment1b {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        float length=sc.nextFloat();
        System.out.println("Enter the breadth");
        float breadth=sc.nextFloat();
        float area=length*breadth;
        System.out.println("Area of rectangle is:"+area);
        float perimeter=2*(length+breadth);
        System.out.println("Perimeter of rectangle:"+perimeter);
  
	}

}
