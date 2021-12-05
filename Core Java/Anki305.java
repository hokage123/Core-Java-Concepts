import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class Anki305 extends JFrame implements ActionListener
{
JFileChooser jfc;
public Anki305()
{
super("File Chooser");
 jfc=new JFileChooser("d:\\c codes");
JButton jb=new JButton("ok");
jb.addActionListener(this);
getContentPane().add(jb);
setLayout(new FlowLayout());
setSize(400,400);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
int x=jfc.showOpenDialog(null);
if(x==JFileChooser.APPROVE_OPTION)
{
File f=jfc.getSelectedFile();
String S=jfc.getName(f);
System.out.println(S);
}
if(x==JFileChooser.CANCEL_OPTION)
	System.out.println("cancel");
}
public static void main(String... s)
{
new Anki305();
}
}