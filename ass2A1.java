package assignment2;


class Employee
{
	int id;
	String name; 
	String dept;
	Double sal;
	static int count=0;
	public Employee()//default constructor
	{
		
	}
	public Employee(int id,String name,String dept,Double sal)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
		count++;
		
	}
	public String toString()
	{
		return"["+id+","+name+","+dept+","+sal+"]";
	}
	public static void countofobject()
	{
		System.out.println("Number of object is created ==> "+Employee.count);
	}
	
	
}

public class ass2A1 {

	public static void main(String[] args) 
	{
		Employee emp1=new Employee(1,"Riya","CS",30000.0);
		Employee.countofobject();
		System.out.println(emp1);
		Employee emp2=new Employee(2,"Shital","Comp",40000.000);
		Employee.countofobject();
		System.out.println(emp2);
		Employee emp3=new Employee(1,"vaishuu","IT",50000.0);
		Employee.countofobject();
		System.out.println(emp3);
		
	}

}
