import java.util.*;
import javax.swing.JFrame;
class Task extends TimerTask
{
int count=1;
//run is a abstract method that defines task performed at runtime
public void run()
{
//if(count==10)
//System.exit(0);
JFrame f=new JFrame();
f.setSize(250,250);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
count++;
}
}
class Anki360
{
public static void main(String... s)
{
Timer timer=new Timer();
int delay=5000;//delay for 5 sec
int period=1000;//repeat every sec
timer.scheduleAtFixedRate(new Task(),delay,period);
}
}