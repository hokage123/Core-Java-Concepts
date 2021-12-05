import java.util.Date;
class RunnableJob implements Runnable
{
public void run()
{
Thread thread=Thread.currentThread();
System.out.println("runnable job is being run by"+thread.getName()+"not"+new Date());
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
}
class Anki334
{
public static void main(String... s)throws InterruptedException
{
RunnableJob runnablejob=new RunnableJob();
Thread thread1=new Thread(runnablejob,"T1");
Thread thread2=new Thread(runnablejob,"T2");
Thread thread3=new Thread(runnablejob,"T3");
Thread thread4=new Thread(runnablejob,"T4");
thread1.start();
thread1.join();
thread2.start();
thread2.join();
thread3.start();
thread3.join();
thread4.start();
thread4.join();
Thread thread5=new Thread(runnablejob,"T5");
Thread thread6=new Thread(runnablejob,"T6");
Thread thread7=new Thread(runnablejob,"T7");
Thread thread8=new Thread(runnablejob,"T8");
thread5.start();
thread6.start();
thread7.start();
thread8.start();
}
}