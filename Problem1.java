import java.awt.*;
import java.awt.event.*;
class Mouse extends Frame
{
	Frame f;
	TextField t,t1;
	Label l,l1;
	int x,y;
	Panel p;
	Mouse()
	{
		f=new Frame("Mouse");
		setLayout(new FlowLayout());
		
		p=new Panel();
		p.setLayout(new GridLayout(2,2,5,5));
		t=new TextField(20);
		l= new Label("Co-ordinates of clicking");
		l1= new Label("Co-ordinates of movement");
		t1=new TextField(20);
		p.add(l);
		p.add(t);
		p.add(l1);
		p.add(t1);
		add(p);
		addMouseListener(new MyClick());
		addMouseMotionListener(new MyMove());
		setSize(500,500);
		setVisible(true);
	}
	class MyClick extends MouseAdapter       //The class MouseAdapter is an abstract (adapter) class for receiving mouse events
	{
		public void mouseClicked(MouseEvent me)  //Invoked when the mouse button has been clicked (pressed and released) on a component.
		{
			x=me.getX();
			y=me.getY();
			t.setText("X="+x+" Y="+y);
		}
	}
	class MyMove extends MouseMotionAdapter
	{
		public void mouseMoved(MouseEvent me)   
		{
			x=me.getX();
			y=me.getY();
			t1.setText("X="+ x +" Y="+y);
		}
	}
}
class Problem1
{
	public static void main(String args[])
	{
		Mouse f = new Mouse();
	}
}