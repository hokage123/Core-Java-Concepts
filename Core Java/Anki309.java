import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Anki309 extends JFrame
{
String[] headings={"name","add","salary"};
String items[][]={{"amit","delhi","1000"},{"ami","delhi","3000"},{"anu","delhi","4000"},{"amy","delhi","5000"},{"ave","delhi","6000"}};
public Anki309()
{
super("table example");
JTable jt=new JTable(items,headings);
JScrollPane jp=new JScrollPane(jt);
add(jp);
add(jt);
setSize(400,400);
pack();
setVisible(true);
}
public static void main(String... s)
{
new Anki309();
}
}