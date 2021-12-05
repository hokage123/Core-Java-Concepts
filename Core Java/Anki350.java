import java.util.concurrent.locks.ReentrantLock;
class Techlead extends Thread
{
ReentrantLock ques_paper;
Techlead(ReentrantLock ques_paper,String name)
{
super(name);
this.ques_paper=ques_paper;
}
public void run()
{
System.out.println(getName()+"is waiting for ques_paper");
ques_paper.lock();
System.out.println(getName()+"takes for ques_paper");
System.out.println(getName()+"start the test");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(getName()+"is interrupted");
}
System.out.println(getName()+"has taken the test");
System.out.println(getName()+"returns the ques_paper");
ques_paper.unlock();
}
}
public class Anki350
{
public static void main(String... s)
{
ReentrantLock ques_paper=new ReentrantLock();
new Techlead(ques_paper,"lalu").start();
new Techlead(ques_paper,"malyalam").start();
new Techlead(ques_paper,"bhalu").start();
}
}