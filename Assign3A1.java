package assignment3;

import java.io.*;

class Continent
{
	String ConName;
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	void getName() throws IOException
	{
		System.out.println("enter the continent");
		ConName=br.readLine();
		
	}
}

class Country extends Continent
{
	String Country_name;
	void Accept() throws IOException
	{
		System.out.println("country name");
		Country_name=br.readLine();
	}
}

class State extends Country
{
	String State_name;
	String Place_name;
	void get() throws IOException
	{
		System.out.println("enter state and place name");
		State_name=br.readLine();
		Place_name=br.readLine();
		
	}
//	void display()
//	{
//		System.out.println("continent name"+ConName);
//	}
}


public class Assign3A1
{

	public static void main(String[] args) throws IOException
	{
		State st=new State();
		st.getName();
		st.Accept();
//		st.display();
		st.get();
		System.out.println("Continent name:"+st.ConName);
		System.out.println("country name:"+st.Country_name);
		System.out.println("state name:"+st.State_name);
		System.out.println("place name:"+st.Place_name);
		
		
	}

}
