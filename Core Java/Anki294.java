import java.awt.*;
import java.awt.event.*;
class Anki294 implements ActionListener
{
Frame f;
Button b;
TextField tf,tf1,tf2;
Anki294()
{
f=new Frame("Sum");
b=new Button("Sum");
b.addActionListener(this);
tf=new TextField();
tf1=new TextField();
tf2=new TextField();
f.add(tf);
f.add(tf1);
f.add(tf2);
f.add(b);
f.setLayout(new FlowLayout());
f.setSize(400,400);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String S1=tf.getText();
String S2=tf1.getText();
int n1=Integer.parseInt(S1);
int n2=Integer.parseInt(S2);
int n3=n1+n2;
String z=String.valueOf(n3);
tf2.setText(z);
}
public static void main(String... s)
{
new Anki294();
}
}