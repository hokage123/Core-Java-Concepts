import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyCanvas extends Canvas
{
Image i;
MyCanvas()
{
Toolkit t=Toolkit.getDefaultToolkit();
i=t.getImage("D:\\menuswingp\\menu\\images\\stop.gif");
}
public void paint(Graphics g)
{
g.drawImage(i,100,100,this);
}
}
class Anki312 extends Frame
{
Anki312()
{
super("graphics");
MyCanvas m=new MyCanvas();
add(m);
setSize(400,400);
setVisible(true);
}
public static void main(String... s)
{
new Anki312();
}
}