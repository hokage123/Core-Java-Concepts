import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Anki303 implements ActionListener
{
JTextField tf=new JTextField();
JFrame jf=new JFrame("my menu");
JMenuBar menubar;
JMenu menu,submenu;
JMenuItem menuitem,exit;
JRadioButtonMenuItem rbmenuitem;
JCheckBoxMenuItem cbmenuitem;
Anki303()
{
jf.add(tf);
menubar=new JMenuBar();
menu=new JMenu("First Menu");
menu.setMnemonic(KeyEvent.VK_F);
menubar.add(menu);
menuitem=new JMenuItem("A text-only menuitem");
menuitem.setMnemonic(KeyEvent.VK_T);
menuitem.addActionListener(this);
Icon i1=new ImageIcon("D:/menuswingp/menu/images/new.gif");
menuitem.setIcon(i1);
KeyStroke i=KeyStroke.getKeyStroke(KeyEvent.VK_1,ActionEvent.CTRL_MASK);
menuitem.setAccelerator(i);
menu.add(menuitem);
menu.addSeparator();
ButtonGroup group=new ButtonGroup();
rbmenuitem=new JRadioButtonMenuItem("a rbmenuitem");
rbmenuitem.setSelected(true);
rbmenuitem.setMnemonic(KeyEvent.VK_R);
rbmenuitem.setIcon(new ImageIcon("D:/menuswingp/menu/images/dining.gif"));
group.add(rbmenuitem);
menu.add(rbmenuitem);
rbmenuitem=new JRadioButtonMenuItem("Another one");
rbmenuitem.setMnemonic(KeyEvent.VK_O);
group.add(rbmenuitem);
rbmenuitem.setIcon(new ImageIcon("D:/menuswingp/menu/images/import.gif"));
menu.add(rbmenuitem);
menu.addSeparator();
cbmenuitem=new JCheckBoxMenuItem("A checkbox menuitem");
cbmenuitem.setMnemonic(KeyEvent.VK_C);
cbmenuitem.setIcon(new ImageIcon("D:/menuswingp/menu/images/find.gif"));
menu.add(cbmenuitem);
cbmenuitem=new JCheckBoxMenuItem("Another one");
cbmenuitem.setIcon(new ImageIcon("D:/menuswingp/menu/images/cut.gif"));
menu.add(cbmenuitem);
menu.addSeparator();
submenu=new JMenu("A submenu");
submenu.setMnemonic(KeyEvent.VK_S);
menuitem=new JMenuItem("An item in the submenu");
menuitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,ActionEvent.ALT_MASK));
submenu.add(menuitem);
menu.add(submenu);
exit=new JMenuItem("exit");
exit.addActionListener(this);
exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3,ActionEvent.SHIFT_MASK));
exit.setIcon(new ImageIcon("D:/menuswingp/menu/images/stop.gif"));
exit.setMnemonic(KeyEvent.VK_X);
menu.add(exit);
menu=new JMenu("Another menu");
menu.setMnemonic(KeyEvent.VK_N);
menubar.add(menu);
jf.setJMenuBar(menubar);
jf.setSize(300,300);
jf.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getActionCommand().equals("exit"))
System.exit(0);
if(e.getActionCommand().equals("A text-only menuitem"));
tf.setText("hello");
}
public static void main(String... s)
{
new Anki303();
}
}