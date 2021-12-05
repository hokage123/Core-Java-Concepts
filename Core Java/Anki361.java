import java.awt.*;
import javax.swing.*;
class ShutdownHooks implements Runnable
{
public void run()
{
System.out.println("*** shutdownHook started***");
System.out.println("*** appln Shuting down***");
try
{
Thread.sleep(1000*5);
}
catch(Exception e)
{}
}
}
class Anki361
{
public static void main(String... s)
{
Runtime runtime=Runtime.getRuntime();
ShutdownHooks hook=new ShutdownHooks();
//registering the shutdownHook
runtime.addShutdownHook(new Thread(hook));
int x=10/0;//kisi bhi tarike se program khatm kro normal yaa abnormal yaa user exception generate kra kr terminate kro jvm ye thread chla kr hi bnd hoga
JFrame testFrame=new JFrame("TestFrame");
testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
testFrame.setSize(400,400);
testFrame.setVisible(true);
System.out.println("Hello");
}
}