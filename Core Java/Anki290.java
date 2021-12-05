import java.awt.*;
import java.awt.event.*;
class Anki290 implements ActionListener
{
Frame f;
Button b,b1;
TextField tf;
Anki290(String S)
{
f=new Frame(S);
b=new Button("ok");
b1=new Button("cancle");
b.setBounds(20,100,40,40);
b1.setBounds(100,100,40,40);
b.addActionListener(new Outer(this));
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
new Anki290("Anki290");
}
}
class Outer implements ActionListener
{
	Anki290 f;
	Outer(Anki290 f)
	{
		this.f=f;
	}
	public void actionPerformed(ActionEvent e)
{
if(e.getSource()==f.b)
f.tf.setText("teri maa");
if(e.getSource()==f.b1)
f.tf.setText("pornhub chala");
}
}