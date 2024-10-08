

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

 
 
class MyCalculator1 implements ActionListener
{
JFrame f;
JTextField t;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
 
static double a=0,b=0,result=0;
static int operator=0;
 
MyCalculator1()
{
f=new JFrame("Calculator");

f.setSize(400,500);
f.setVisible(true);
 
 //Font fo=new Font("Arial",Font.BOLD,18);
 
 // t.setFont(fo);


b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("4");
b5=new JButton("5");
b6=new JButton("6");
b7=new JButton("7");
b8=new JButton("8");
b9=new JButton("9");
b0=new JButton("0");
bdiv=new JButton("/");
bmul=new JButton("*");
bsub=new JButton("-");
badd=new JButton("+");
bdec=new JButton(".");
beq=new JButton("=");
bdel=new JButton("Delete");
bclr=new JButton("Clear");


f.setLayout(new BorderLayout());
JPanel p=new JPanel();
p.setLayout(new GridLayout(5,4));

p.add(b7);
p.add(b8);
p.add(b9);
p.add(bdiv);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(bmul);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(bsub);
p.add(bdec);
p.add(b0);
p.add(beq);
p.add(badd);
p.add(bdel);
p.add(bclr);

t=new JTextField();
f.add(p,BorderLayout.CENTER);
f.add(t,BorderLayout.NORTH);

f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//f.setResizable(false);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
badd.addActionListener(this);
bdiv.addActionListener(this);
bmul.addActionListener(this);
bsub.addActionListener(this);
bdec.addActionListener(this);
beq.addActionListener(this);
bdel.addActionListener(this);
bclr.addActionListener(this);
}

 


public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
t.setText(t.getText().concat("1"));
if(e.getSource()==b2)
t.setText(t.getText().concat("2"));
if(e.getSource()==b3)
t.setText(t.getText().concat("3"));
if(e.getSource()==b4)
t.setText(t.getText().concat("4"));
if(e.getSource()==b5)
t.setText(t.getText().concat("5"));
if(e.getSource()==b6)
t.setText(t.getText().concat("6"));
if(e.getSource()==b7)
t.setText(t.getText().concat("7"));
if(e.getSource()==b8)
t.setText(t.getText().concat("8"));
if(e.getSource()==b9)
t.setText(t.getText().concat("9"));
if(e.getSource()==b0)
t.setText(t.getText().concat("0"));
if(e.getSource()==bdec)
t.setText(t.getText().concat("."));
if(e.getSource()==badd)
{
a=Double.parseDouble(t.getText());
operator=1;
t.setText("");
}
if(e.getSource()==bsub)
{
a=Double.parseDouble(t.getText());
operator=2;
t.setText("");
}
if(e.getSource()==bmul)
{
a=Double.parseDouble(t.getText());
operator=3;
t.setText("");
}
if(e.getSource()==bdiv)
{
a=Double.parseDouble(t.getText());
operator=4;
t.setText("");
}
if(e.getSource()==beq)
{
b=Double.parseDouble(t.getText());
switch(operator)
{
case 1: result=a+b;
break;
case 2: result=a-b;
break;
case 3: result=a*b;
break;
case 4: result=a/b;
break;
default: result=0;
}
t.setText(""+result);
}
if(e.getSource()==bclr)
t.setText("");
if(e.getSource()==bdel)
{
String s=t.getText();
t.setText("");
for(int i=0;i<s.length()-1;i++)
t.setText(t.getText()+s.charAt(i));
}
}
 
public static void main(String args[])
{
new MyCalculator1();
}
}
