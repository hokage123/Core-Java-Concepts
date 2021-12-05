class Anki333
{
public static void main(String... s)
{
Thread t1=new Thread(new MyRunnable(),"t1");
Thread t2=new Thread(new MyRunnable(),"t2");
Thread t3=new Thread(new MyRunnable(),"t3");
t1.start();
//start second thread after waiting for 2 secs if it is dead
try
{
t1.join(2000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
t2.start();
//start third thread only when first thread is dead
try
{
t1.join();
}
catch(InterruptedException e)
{
e.printStackTrace();
}
t3.start();
//let all thread finish execution before the main thread
try
{
t1.join();
t2.join();
t3.join();
}
catch(InterruptedException e)
{
e.printStackTrace();
}
System.out.println("All thread are dead exiting the main thread");
}
}
class MyRunnable implements Runnable
{
public void run()
{
System.out.println("ThreadStarted:::"+Thread.currentThread().getName());
try
{
Thread.sleep(4000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
System.out.println("ThreadEnded:::"+Thread.currentThread().getName());
}
}