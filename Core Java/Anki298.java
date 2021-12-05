import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Anki298 
{
JFrame f;
JButton b[];
Anki298(String S)
{
f=new JFrame(S);
b=new JButton[5];
String S1[]={"North","South","East","West","Center"};
for(int i=0;i<b.length;i++)
{
b[i]=new JButton(S1[i]);
f.add(b[i]);
}
f.setLayout(new GridLayout(2,3,10,10));
Anki299.setJavaLookAndFeel();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String... s)
{
new Anki298("GridLayout");
}
}