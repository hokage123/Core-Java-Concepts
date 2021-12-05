import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Anki306 extends JFrame
{
public static void main(String... s)
{
new Anki306();
}
public Anki306()
{
super("multiple document interface");
Anki299.setJavaLookAndFeel();
addWindowListener(new ExitListener());
Container content=getContentPane();
content.setBackground(Color.white);
JDesktopPane desktop=new JDesktopPane();
desktop.setBackground(Color.white);
content.add(desktop,BorderLayout.CENTER);
setSize(450,400);
for(int i=0;i<5;i++)
{
JInternalFrame frame=new JInternalFrame(("internalFrame"+i),true,true,true,true);
frame.setLocation(i*50+10,i*50+10);
frame.setSize(200,150);
frame.setBackground(Color.red);
frame.setVisible(true);
desktop.add(frame);
frame.moveToBack();
}
setVisible(true);
}
}