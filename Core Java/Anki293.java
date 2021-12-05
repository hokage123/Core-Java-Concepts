import java.awt.*;
import java.awt.event.*;
class Anki293 implements ActionListener
{
Frame f;
Button b,b1;
TextField tf;
Anki293(String S)
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
new Anki293("Anki293");
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
Anki293 t;
MyMouseEventListener(Anki293 f)
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
char c[],f[],i;
int d=0,n,j;
MyKeyEventListener()
{
n=new java.util.Scanner(System.in).nextInt();
c=new char[n];	
}
public void keyTyped(KeyEvent e)
{

	c[j]=e.getKeyChar();

f=new String(c).toLowerCase().toCharArray();
for(j=0;j<n;j++)
for(i='a';i<='z';i++)
{
if(f[j]==i)
d++;
}
if(n==d)
{
for(j=0;j<n;j++)
System.out.print(c[j]);
}
else
System.out.println("invalid Character");
}
}