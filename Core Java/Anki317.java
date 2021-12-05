/*<applet code="Anki317"height=400 width=400></applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Anki317 extends Applet
{
String S;
public Anki317()
{
S="Constructor";
}
public void init()
{
S=S+"init";
}
public static void main(String... s)
{
System.out.println("main");
}
public void start()
{
setBackground(Color.yellow);
S=S+"start";
display();
}
public void paint(Graphics g)
{
S=S+"paint";
g.drawString(S,30,30);
}
 void display()
{
S=S+"display";
}
}