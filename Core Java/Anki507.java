//Callable interface
//jaise runnable ka run vaise Callable ka call par ye Threadpool par kaam with the help of executor framework  saath saath ye Future jo ki generic hai us class ka obj bhi return 
//Future class ke obj se current status batata hai
//get() method provide jo delay krke chalta hai kai task parallel me ho rahi hi
//ye cancel() method bhi provide to cancel task aur overloaded get() to specify the time
//isDone() and iscancelled se bhi current status find out kr skte hai
import java.util.concurrent.*;
import java.util.*;
class MyCallable1 implements Callable
{
public String call() throws Exception
{
Thread.sleep(2000);
//return name of thread
return (Thread.currentThread().getName());
}
}
class Anki507
{
public static void main(String... s)
{
ExecutorService executor=Executors.newFixedThreadPool(5);
//collection to store results
ArrayList<Future<String>> list=new ArrayList<>();
for(int i=0;i<10;i++)
{
Future<String> future=executor.submit(new MyCallable1());
list.add(future);
}
//print results
for(Future<String> future:list)
{
try
{
System.out.println(future.get());
}
catch(Exception e)
{}
}
executor.shutdown();
}
}