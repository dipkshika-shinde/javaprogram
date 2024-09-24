package assignment3;

import java.util.Scanner;
interface FuncInterface
{
	void abstractFun(int x);
	
}

public class Assign3A4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find cube");
		int n=sc.nextInt();
		FuncInterface fobj=(int x)->System.out.println(x*x*x);
		fobj.abstractFun(n);

	}

}
