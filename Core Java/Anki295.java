import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Anki295 
{
JFrame f;
JButton b[];
Anki295(String S)
{
f=new JFrame(S);
b=new JButton[5];
String S1[]={"North","South","East","West","Center"};
String x[]={BorderLayout.NORTH,BorderLayout.SOUTH,BorderLayout.EAST,BorderLayout.WEST,BorderLayout.CENTER};
for(int i=0;i<b.length;i++)
{
b[i]=new JButton(S1[i]);
f.add(b[i],x[i]);
}
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String... s)
{
new Anki295("BorderLayout");
}
}