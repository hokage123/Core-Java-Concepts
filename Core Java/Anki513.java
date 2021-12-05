//ThreadLocal
//ThreadLocal ki koobsoorti ye ki different threads apni alag alag val iske ek hi obj me set krange set() se aursab Thread ko kudh ki set()  ki huyi val vaapas get() se 
//ThreadLocal ka var create private ThreadLocal<Integer> threadLocal=new ThreadLocal<Integer>();aise
class Anki513
{
static int x=19;
public static class MyRunnable implements Runnable
{
private ThreadLocal<Integer> threadLocal=new ThreadLocal<Integer>();

@Override
public void run()
{
int z=(int)(Math.random()*100D);//random() se 0 se 1 ke bich ki random val
System.out.println(Thread.currentThread().getName()+""+z);
threadLocal.set(z);
//threadLocal.set(z);
try
{
Thread.sleep(2000);
}
catch(InterruptedException e)
{}
System.out.println(Thread.currentThread().getName()+""+threadLocal.get());
}
}
public static void main(String... d)
{
MyRunnable sharedRunnableInstance=new MyRunnable();
Thread thread1=new Thread(sharedRunnableInstance);//sbme ek hi Runnable ka instance yani ek hi ThreadLocal ka bhi obj
Thread thread2=new Thread(sharedRunnableInstance);
Thread thread3=new Thread(sharedRunnableInstance);
Thread thread4=new Thread(sharedRunnableInstance);
thread1.start();
thread2.start();
thread3.start();
thread4.start();
}
}