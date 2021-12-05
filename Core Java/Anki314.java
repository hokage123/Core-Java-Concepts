import java.awt.*;
import java.awt.event.*;
class MyCanvas1 extends Canvas
{
int flag=0;
public void paint(Graphics g)
{
if(flag==1)
{
g.setColor(Color.RED);
g.drawLine(70,70,200,200);
}
System.out.println("hello");
}
}
class Anki314 implements ActionListener
{
MyCanvas1 m=new MyCanvas1();
Anki314()
{
Frame f=new Frame("graphics");
Button b=new Button("line");
f.add(m);
f.add(b);
b.addActionListener(this);
f.setSize(400,400);
f.setLayout(new GridLayout(2,1));
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
m.flag=1;
m.repaint();
}
public static void main(String... s)
{
new Anki314();
}
}