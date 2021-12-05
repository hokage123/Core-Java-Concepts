import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Anki304 extends MouseAdapter
{
JFrame f=new JFrame("jalebi bai");
JPopupMenu p=new JPopupMenu("Octopops");
JMenuItem i1=new JMenuItem("new doc");
JMenuItem i2=new JMenuItem("open doc");
JMenuItem i3=new JMenuItem("Save doc");
JMenuItem i4=new JMenuItem("exit from doc");
Anki304()
{
p.add(i1);
p.add(i2);
p.add(i3);
p.add(i4);
f.addMouseListener(this);
f.setSize(400,400);
f.setVisible(true);
}
public void mouseClicked(MouseEvent e)
{
int x=e.getButton();
if(x==MouseEvent.BUTTON2)
p.show(e.getComponent(),e.getX(),e.getY());
}
public static void main(String... s)
{
new Anki304();
}
}