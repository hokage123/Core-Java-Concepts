import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Anki301 extends JFrame implements ActionListener
{
public static void main(String... s)
{
new Anki301();
}
public Anki301()
{
super("using JColorChooser");
Anki299.setMotifLookAndFeel();
addWindowListener(new ExitListener());
Container content=getContentPane();
content.setBackground(Color.WHITE);
content.setLayout(new FlowLayout());
JButton colorbutton=new JButton("choose Background color");
colorbutton.addActionListener(this);
content.add(colorbutton);
setSize(300,100);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
Color bgColor=JColorChooser.showDialog(this,"choose Background color",Color.RED);
if(bgColor!=null)
getContentPane().setBackground(bgColor);
}
} 