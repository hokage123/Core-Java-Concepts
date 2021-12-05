class Thread1 extends Thread
{
Thread1(String S)
{
//super(S);
}
public void run()
{
for(int i=1;i<5;i++)
{
System.out.println(currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e){}
}
System.out.println(getName()+"dead");
}
}
class Thread2 extends Thread
{
Thread2(String S)
{
//super(S);
}
public void run()
{
for(int i=1;i<10;i++)
{
System.out.println(currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e){}
}
System.out.println(getName()+"dead");
}
}
class Thread3 extends Thread
{
Thread3(String S)
{
//super(S);
}
public void run()
{
for(int i=1;i<15;i++)
{
System.out.println(currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e){}
}
System.out.println(getName()+"dead");
}
}
class Anki329
{
public static void main(String... s)
{
Thread1 t1=new Thread1("Thread1");
Thread2 t2=new Thread2("Thread2");
Thread3 t3=new Thread3("Thread3");
t1.run();
t2.run();
t3.run();
for(int i=1;i<=20;i++)
{
System.out.println(Thread.currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e){}
}
System.out.println(Thread.currentThread().getName());
}
}