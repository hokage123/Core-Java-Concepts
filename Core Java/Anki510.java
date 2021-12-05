//ConcurrentLinkedQueue
//ye FIFO First In First Out Synchronized jab add() chala remove() nahi jab remove() chala add() nahi par ek hi time par add() ke baad turant remove() jo add vahi remove
//jo add pehle wo remove pehle
import java.util.concurrent.*;
class Anki510
{
public static void main(String... s)throws Exception
{
ConcurrentLinkedQueue<String> queue=new ConcurrentLinkedQueue<String>();
Thread producer=new Thread(new Producer(queue));
Thread consumer=new Thread(new Consumer(queue));
producer.start();
Thread.sleep(100);
consumer.start();
}
}
//the producer put String on the queue
class Producer implements Runnable
{
ConcurrentLinkedQueue<String> queue;
Producer(ConcurrentLinkedQueue<String> queue)
{
this.queue=queue;
}
public void run()
{
System.out.println("producer started");
try
{
for(int i=1;i<10;i++)
{
queue.add("String"+i);
System.out.println("added: String"+i);
Thread.currentThread().sleep(1000);
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
//the consumer remove String from the queue
class Consumer implements Runnable
{
ConcurrentLinkedQueue<String> queue;
Consumer(ConcurrentLinkedQueue<String> queue)
{
this.queue=queue;
}
public void run()
{
String str;
System.out.println("consumer started");
for(int x=0;x<10;x++)
{
try
{	
while((str=queue.poll())!=null)
{
System.out.println("remove:"+str);
Thread.currentThread().sleep(1000);
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
}