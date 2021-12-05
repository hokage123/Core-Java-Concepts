//Threadpool
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class WorkerThread implements Runnable
{
private String command;
public WorkerThread(String s)
{
this.command=s;
}
@Override
public void run()
{
System.out.println(Thread.currentThread().getName()+"start command="+command);
processCommand();
System.out.println(Thread.currentThread().getName()+"End");
}
private void processCommand()
{
try
{
Thread.sleep(3000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
public String toString()
{
return this.command;
}
}
class Anki506
{
public static void main(String... s)
{
//5 Threads ka Threadpool banaya
ExecutorService executor=Executors.newFixedThreadPool(5);//Thread ka obj hai five Runnable ko implement krne wali class ka ref hai ten toh five command chlne ke baad koi thread khaali toh wo aage ki command jo Thread pehle Command0 chala rhi thi ab command7 chalayage 
for(int i=0;i<10;i++)
{
Runnable worker=new WorkerThread(""+i);
executor.execute(worker);//thread chalaye
}
executor.shutdown();//Executor ko shutdown kiya
while(!executor.isTerminated())//loop chalaya jab tak executor ka kaam nhi ruka
{}
System.out.println("Finished all Thread");
}
}
//Thread five hi bani par ten ke liye kaam jo pehle Command0 ab Command7