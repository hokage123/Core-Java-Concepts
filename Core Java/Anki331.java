class Thread3 implements Runnable
{
int x;
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(Thread.currentThread().getName()+""+x);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
}
}
class Anki331
{
public static void main(String... s)
{
Thread3 t1=new Thread3();
t1.x=50;
Thread tt1=new Thread(t1,"Thread1");
tt1.start();
Thread3 t2=new Thread3();
t2.x=100;
Thread tt2=new Thread(t1,"Thread2");
tt2.start();
Thread3 t3=new Thread3();
t3.x=150;
Thread tt3=new Thread(t1,"Thread3");
tt3.start();
for(int i=1;i<=5;i++)
{
System.out.println(Thread.currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e){}
}
}
}