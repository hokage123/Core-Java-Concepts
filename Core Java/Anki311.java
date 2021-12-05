import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Anki311 extends JPanel
{
public Anki311()
{
setLayout(new BorderLayout());
UIManager.put("TabbedPane.selected",Color.green);
JTabbedPane tabbedpane=new JTabbedPane(JTabbedPane.BOTTOM);
String tabs[]={"one","two","three","four"};
Color[] colors={null,Color.red,Color.blue,Color.yellow};
for(int i=0;i<tabs.length;i++)
{
tabbedpane.add(tabs[i],createpane(tabs[i]));
tabbedpane.setBackgroundAt(i,colors[i]);
}
tabbedpane.setSelectedIndex(0);
add(tabbedpane,BorderLayout.CENTER);
}
JPanel createpane(String S)
{
JPanel p=new JPanel();
p.add(new JLabel(S));
return p;
}
public static void main(String... s)
{
JFrame fra=new JFrame("Tab color example");
fra.addWindowListener(new WindowAdapter()
{
public void WindowClosing(WindowEvent e)
{
System.exit(0);
}
}
);
fra.getContentPane().add(new Anki311());
fra.setSize(400,400);
fra.setVisible(true);
}
}