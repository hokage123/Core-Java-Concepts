//ThreadFactory
//Aisi classes ThreadFactory kehlyenge jo Thread ka obj banakar de deti ho
//hame ThreadFactory naam ki interface mili hai jiske newThread() method ko override krke Thread ka obj return
import java.util.concurrent.*;
class Anki512 implements ThreadFactory
{
public Thread newThread(Runnable r)
{
return new Thread(r);
}
public static void main(String... g)
{
Anki512 mtf=new Anki512();
Thread t=mtf.newThread(new MyThread());
t.start();
}
}
class MyThread implements Runnable
{
public void run()
{
System.out.println("inside"+Thread.currentThread().getName());
} 
}