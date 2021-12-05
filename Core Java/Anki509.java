//BlockingQueue
//BlockingQueue naam ka interface ArrayBlockingQueue naam ki class implement Blocking queue generic class par based
//BlockingQueue ka purpose Thread ke bich me data share karwana 
//dequeue nahi kr skta jab empty enqueue nahi kr skta jab full
import java.util.concurrent.*;
class Anki509
{
public static void main(String... g)throws Exception
{
BlockingQueue queue=new ArrayBlockingQueue(5);
Producer producer=new Producer(queue);
Consumer consumer=new Consumer(queue);
System.out.println("starting Producer");
new Thread(producer).start();
System.out.println("starting Consumer");
new Thread(consumer).start();
}
}
//producer class it sleeps 3 secs between each put() call
//This will cause consumer to block while waiting for obj in the queue
class Producer implements Runnable
{
protected BlockingQueue queue=null;
public Producer(BlockingQueue queue)
{
this.queue=queue;
}
public void run()
{
try
{
queue.put("String one");//put() se Producer queue ke andar dlta hai
Thread.sleep(3000);
queue.put("String Two");
Thread.sleep(3000);
queue.put("String Three");
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
}
class Consumer implements Runnable
{
protected BlockingQueue queue=null;
public Consumer(BlockingQueue queue)
{
this.queue=queue;
}
public void run()
{
try
{
System.out.println(queue.take());//take() method se consumer queue se bahar nikalta hai
System.out.println(queue.take());
System.out.println(queue.take());
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
}
/*this example uses the ArrayBlockingQueue implementation of BlockingQueue interface.The Anki509 class starts producer and
consumer seperate threads.The Producer insert Strings into SharedBlockingQueue while Consumer take them out*/