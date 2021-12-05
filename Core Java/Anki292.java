import java.awt.*;
import java.awt.event.*;
class Anki292 implements ActionListener
{
Frame f;
Button b,b1;
TextField tf;
Anki292(String S)
{
f=new Frame(S);
b=new Button("ok");
b1=new Button("cancle");
b.setBounds(20,100,40,40);
b1.setBounds(100,100,40,40);
b.addActionListener(this);
b1.addActionListener(this);
f.add(b);
f.add(b1);
f.addWindowListener(new MyWindowEventListener());
tf=new TextField();
tf.setBounds(20,40,100,50);
f.add(tf);
f.addMouseListener(new MyMouseEventListener(this));
tf.addKeyListener(new MyKeyEventListener());
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
new Anki292("Anki292");
}
}
class MyWindowEventListener extends WindowAdapter
{
public void windowClosing(WindowEvent e1)
{
System.exit(0);
}
} 
class MyMouseEventListener extends MouseAdapter
{
Anki292 t;
MyMouseEventListener(Anki292 f)
{
this.t=f;
}
public void mouseClicked(MouseEvent e1)
{
t.tf.setText("mouseevent");
t.f.setBackground(Color.RED);
}
}
class MyKeyEventListener extends KeyAdapter
{
public void keyTyped(KeyEvent e)
{
System.out.println(e.getKeyChar());
}
}