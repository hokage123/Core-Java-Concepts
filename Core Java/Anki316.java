import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Anki316 implements ActionListener
{
JFrame f;
JButton b;
Button b1;
JTextField jt;
Icon i;
Anki316(String S)
{
i=new ImageIcon("D:\\menuswingp\\menu\\images\\stop.gif");
f=new JFrame("Swing");
jt=new JTextField();
jt.setBounds(150,40,100,100);
b=new JButton("swing");
b1=new Button("awt");
b.setBounds(40,40,100,100);
b1.setBounds(40,150,50,50);
Container c=f.getContentPane();
c.add(jt);
c.add(b);
c.add(b1);
b.addActionListener(this);
c.setLayout(null);
f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
f.setSize(400,400);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
b.setIcon(i);
jt.setText("swing example");
}
public static void main(String... s)
{
new Anki316("First Frame");
new Anki316("Second Frame");
}
}