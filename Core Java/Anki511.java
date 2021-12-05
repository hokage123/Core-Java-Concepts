//Exchanger
//Exchanger ke through dono Thread ka data swap ek Thread par exchange() chala "Hello" uska data abhi data swap nahi jab dusri Thread par bhi exchange "Hey" jiska data tab dono ka exchange
import java.util.concurrent.*;
import java.util.*;
class Anki511
{
public static void main(String... s)
{
Exchanger<String> exchanger=new Exchanger<String>();
Thread t1=new MyThread(exchanger,"ILike Cofee");
Thread t2=new MyThread(exchanger,"ILike tea");
t1.start();
t2.start();
}
}
class MyThread extends Thread
{
Exchanger<String> exchanger;
String message;
MyThread(Exchanger<String> exchanger,String message)
{
this.exchanger=exchanger;
this.message=message;
}
public void run()
{
try
{
System.out.println(this.getName()+"message"+message);
//exchange messages
message=exchanger.exchange(message);
System.out.println(this.getName()+"message"+message);
}
catch(Exception e)
{}
}
}