//yahan par HRManager yaani Anki504 teeno thread start kr ke chala gaya aur techlead ko aapas me offer letter distribute krne ka 
//kaam diya.toh teeno offer ek common point par await() chalakar ruke phir jab teeno thread se await chal() gaya toh teeno ne  
//aapas me offer letter distribute kr diya.
//CyclicBarrier kaa fayda over CountDownLatch is that threads can be reused
import java.util.concurrent.CyclicBarrier;
class Anki504
{
public static void main(String... s)
{
CyclicBarrier cyclicBarrier=new CyclicBarrier(3);
Techlead techLead1=new Techlead(cyclicBarrier,"lalu");
Techlead techLead2=new Techlead(cyclicBarrier,"rabari");
Techlead techLead3=new Techlead(cyclicBarrier,"meesa");
techLead1.start();
techLead2.start();
techLead3.start();
System.out.println("No work for HRManager");
}
}
class Techlead extends Thread
{
CyclicBarrier cyclicBarrier;
public Techlead(CyclicBarrier cyclicBarrier,String name)
{
super(name);
this.cyclicBarrier=cyclicBarrier;
}
@Override
public void run()
{
try
{
System.out.println(Thread.currentThread().getName()+"recruited developer");
System.out.println(Thread.currentThread().getName()+"waiting others to complete...");
cyclicBarrier.await();
System.out.println("All finished recruiting"+Thread.currentThread().getName()+"gives offer letter to candidate");
}
catch(Exception e)
{
e.printStackTrace();
}
}
}