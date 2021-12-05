import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.Container;

import javax.swing.JComboBox;
import javax.swing.JFrame;
class Anki307 extends JFrame
{
public Anki307()
{
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
String[] sList=new String[]{"spring","summer","fall","Winter"};
JComboBox seasons=new JComboBox(sList);
seasons.addItemListener(new MyItem());
Container contentpane=this.getContentPane();
contentpane.add(seasons,BorderLayout.CENTER);
}
public static void main(String... s)
{
Anki307 d=new Anki307();
d.setSize(300,300);
d.setVisible(true);
}
}
class MyItem implements ItemListener
{
public void itemStateChanged(ItemEvent e)
{
Object item=e.getItem();
if(e.getStateChange()==ItemEvent.SELECTED)
System.out.println(item+"has been selected");
else if(e.getStateChange()==ItemEvent.DESELECTED)
System.out.println(item+"has been deselected");
}
}