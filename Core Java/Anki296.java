import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Anki296 implements ActionListener
{
JFrame f;
JPanel jp;
CardLayout c1;
JButton b[];
Anki296(String S)
{
jp=new JPanel();
c1=new CardLayout();
jp.setLayout(c1);
f=new JFrame(S);
b=new JButton[5];
String S1[]={"North","South","East","West","Center"};
for(int i=0;i<b.length;i++)
{
b[i]=new JButton(S1[i]);
b[i].addActionListener(this);
jp.add(b[i],"t"+i);
}
f.add(jp);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(400,400);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
c1.next(jp);
}
public static void main(String... s)
{
new Anki296("CardLayout");
}
}