import javax.swing.*;
import java.awt.*;
public class Anki302 extends JFrame
{
public Anki302(String labelString,JRadioButton radiobuttons[],ButtonGroup buttonGroup)
{
setLayout(new FlowLayout(FlowLayout.LEFT));
add(new JLabel(labelString));
for(int i=0;i<radiobuttons.length;i++)
{
add(radiobuttons[i]);
buttonGroup.add(radiobuttons[i]);
}
pack();
setVisible(true);
}
public static void main(String... s)
{
JRadioButton jb[]=new JRadioButton[5];
for(int i=0;i<jb.length;i++)
jb[i]=new JRadioButton(i+1+"");
ButtonGroup bg=new ButtonGroup();
new Anki302("jb ex",jb,bg);
}
}