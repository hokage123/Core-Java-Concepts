import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
class Anki310
{
JFrame jf;
JTree jt;
JScrollPane jp;
Anki310()
{
jf=new JFrame("tree demo");
DefaultMutableTreeNode root=new DefaultMutableTreeNode("root");
DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");
root.add(color);
root.add(font);
DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");
DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");
color.add(red);
color.add(green);
color.add(blue);
DefaultMutableTreeNode bold=new DefaultMutableTreeNode("bold");
DefaultMutableTreeNode italics=new DefaultMutableTreeNode("italics");
DefaultMutableTreeNode un=new DefaultMutableTreeNode("un");
font.add(bold);
font.add(italics);
font.add(un);
jt=new JTree(root);
jp=new JScrollPane(jt);
jf.add(jp);
jf.setSize(300,300);
jf.setVisible(true);
}
public static void main(String... s)
{
new Anki310();
}
}