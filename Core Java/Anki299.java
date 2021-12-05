import java.awt.*;
import javax.swing.*;
public class Anki299
{
public static void setNativeLookAndFeel()
{
try
{
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
}
catch(Exception e)
{
System.out.println("error setting Native LookAndFeel:"+e);
}
}
public static void setJavaLookAndFeel()
{
try
{
UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
}
catch(Exception e)
{
System.out.println("error setting Java LookAndFeel"+e);
}
}
public static void setMotifLookAndFeel()
{
try
{
UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
}
catch(Exception e)
{
System.out.println("error setting Motif LookAndFeel"+e);
}
}

public static JFrame OpenInJFrame(Container content,int width,int height,String title,Color bgcolor)
{
JFrame frame=new JFrame(title);
frame.setBackground(bgcolor);
frame.setSize(400,400);
frame.setContentPane(content);
frame.addWindowListener(new ExitListener());
frame.setVisible(true);
return (frame);
}
public static JFrame OpenInJFrame(Container content,int width,int height)
{
return(OpenInJFrame(content,width,height,content.getClass().getName(),Color.yellow));
}
public static JFrame OpenInJFrame(Container content,int width,int height,String title)
{
return(OpenInJFrame(content,width,height,title,Color.red));
}

}