//Advance Threading
//CountDownLatch
import java.util.concurrent.CountDownLatch;
class Anki503
{
public static void main(String... g)
{
CountDownLatch countDownLatch=new CountDownLatch(3);
Techlead techlead1=new Techlead(countDownLatch,"Amit");
Techlead techlead2=new Techlead(countDownLatch,"Sachin");
Techlead techlead3=new Techlead(countDownLatch,"Dinesh");
techlead1.start();
techlead2.start();
techlead3.start();
try
{
System.out.println("HRManager for recruitment to complete");
countDownLatch.await();
System.out.println("Distribute offer letter");
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
}
class Techlead extends Thread
{
CountDownLatch countDownLatch;
public Techlead(CountDownLatch countDownLatch,String name)
{
super(name);
this.countDownLatch=countDownLatch;
}
@Override
public void run()
{
try
{
Thread.sleep(2000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
System.out.println(Thread.currentThread().getName()+":recruted");
countDownLatch.countDown();
try
{
Thread.sleep(3000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
System.out.println(Thread.currentThread().getName()+"Dead");
}
}
//HRManager yaani Anki503 ne ne teen Techlead ke instance banaye Techlead class simple jo 2 sec ke liye wait krta hai for recruitment
//HRManager ne 3 parameter pass krke CountDownLatch ka obj banakar har Techlead ke instance ko share har techlead ko pass
//HRManager await() chalata hai aur wait krta hai jab tak teen baar countDown() na chal jaaye aur phir offerletter HRManager hi dega jab teeno devlopers ko Techlead ne recrute kr diya
