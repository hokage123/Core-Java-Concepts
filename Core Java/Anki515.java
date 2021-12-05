//volatile banane par bhi kabhi kabhi older val print 5,6,7,8 issi liye hame atomic ne int and long ke liye wrraperclasses jinme incrementAndGet() jo apne aap Atomic Operation yaani increment krke val vaapas
//get() se val vaapas
import java.util.concurrent.atomic.AtomicInteger;
class Anki515
{
public static void main(String... g)throws InterruptedException
{
ProcessingThread pt=new ProcessingThread();
Thread t1=new Thread(pt,"t1");
t1.start();
Thread t2=new Thread(pt,"t2");
t2.start();
t1.join();
t2.join();
System.out.println("processingcount="+pt.getCount());
}
}
class ProcessingThread implements Runnable
{
private AtomicInteger count=new AtomicInteger();
public void run()
{
for(int i=1;i<5;i++)
{
System.out.println("hello");
processSomething(i);
count.incrementAndGet();
}
}
public int getCount()
{
return this.count.get();
}
private void processSomething(int i)
{
//processing some job
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