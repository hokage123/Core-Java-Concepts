import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Anki318 extends Applet implements ActionListener
{
TextField tf1,tf2,tf3;
Button b;
public void init()
{
tf1=new TextField(10);
tf2=new TextField(10);
tf3=new TextField(10);
b=new Button("ok");
add(tf1);
add(tf2);
add(tf3);
add(b);
setBackground(Color.yellow);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String S1=tf1.getText();
String S2=tf2.getText();
int n1=Integer.parseInt(S1);
int n2=Integer.parseInt(S2);
int n3=n1+n2;
tf3.setText(String.valueOf(n3));
My m=new My();
m.setVisible(true);
}
}