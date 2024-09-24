package assignment1;
import java.sql.Date;
import java.text.SimpleDateFormat;


public class ass1B1 {

	public static void main(String[] args)
	{
	Date d=new Date(0);
	SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
	String strdate=format.format(d);
	System.out.println("curremt date id:"+strdate);
	
	format=new SimpleDateFormat("dd-MM-yyyy");
	String strdate1=format.format(d);
	System.out.println("curremt date id:"+strdate1);
	
	format=new SimpleDateFormat(" EEEE  MMMM dd yyyy");
	String strdate2=format.format(d);
	System.out.println("curremt date id:"+strdate2);
	
	format=new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy ");
	String strdate3=format.format(d);
	System.out.println("curremt date id:"+strdate3);
	
	format=new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
	String strdate4=format.format(d);
	System.out.println("curremt date id:"+strdate4);
	
	
	

	}

}
