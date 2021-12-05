import java.awt.*;
import java.awt.event.*;
class Anki291 implements ActionListener
{
Frame f;
Button b,b1;
TextField tf;
Anki291(String S)
{
f=new Frame(S);
b=new Button("ok");
b1=new Button("cancle");
b.setBounds(20,100,40,40);
b1.setBounds(100,100,40,40);
b.addActionListener(
new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("InnerListener");
}
}
);
b1.addActionListener(this);
f.add(b);
f.add(b1);
tf=new TextField();
tf.setBounds(20,40,100,50);
f.add(tf);
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b)
tf.setText("ok");
if(e.getSource()==b1)
tf.setText("cancel");
}
public static void main(String... s)
{
new Anki291("Anki291");
}
}