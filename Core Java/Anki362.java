class Anki362//jab jis thread ko demon thread service provide kr rhi vo dead toh daemon thread apne aap dead
{
public static void main(String... s)
{
Thread1 t1=new Thread1("Thread1");
Thread2 t2=new Thread2("Thread2");
Thread3 t3=new Thread3("Thread3");
t1.setDaemon(true);
t2.setDaemon(true);
t3.setDaemon(true);
t1.start();
t2.start();
t3.start();
for(int i=1;i<=20;i++)
{
System.out.println(Thread.currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
System.out.println(Thread.currentThread().getName()+"dead");
}
}
class Thread1 extends Thread
{
Thread1(String S)
{
super(S);
}
public void run()
{
for(int i=1;i<=200;i++)
{
System.out.println(Thread.currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
System.out.println(Thread.currentThread().getName()+"dead");
}
} 
class Thread2 extends Thread
{
Thread2(String S)
{
super(S);
}
public void run()
{
for(int i=1;i<=200;i++)
{
System.out.println(Thread.currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
System.out.println(Thread.currentThread().getName()+"dead");
}
} 
class Thread3 extends Thread
{
Thread3(String S)
{
super(S);
}
public void run()
{
for(int i=1;i<=200;i++)
{
System.out.println(Thread.currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
System.out.println(Thread.currentThread().getName()+"dead");
}
} 