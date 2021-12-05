//like between lock() and unlock() in ReentrantLock class there is a critical section here it will be between aquire() and release()in SemaPhore class
//lekin yahan ek Thread ki jagah par Pool of Thread jayega aur jab us pool me se jagah empty hogi toh other thread will enter
import java.util.concurrent.Semaphore;
class Anki505
{
public static void main(String... s)
{
Semaphore questionPaperPool=new Semaphore(2);//pool ka size two
Techlead techLead1=new Techlead(questionPaperPool,"Amit Tl");
Techlead techLead2=new Techlead(questionPaperPool,"Sachin Tl");
Techlead techLead3=new Techlead(questionPaperPool,"Dinesh Tl");
Techlead techLead4=new Techlead(questionPaperPool,"Gaurav Tl");
techLead1.start();
techLead2.start();
techLead3.start();
techLead4.start();
System.out.println("No work for HRManager");
}
}
//the HRManager creates 4 Techlead and awaits
class Techlead extends Thread
{
Semaphore questionPaperPool;
public Techlead(Semaphore questionPaperPool,String name)
{
super(name);
this.questionPaperPool=questionPaperPool;
}
@Override
public void run()
{
try
{
System.out.println(Thread.currentThread().getName()+"waiting for the question Paper");
//aquiring one question Paper
questionPaperPool.acquire();
System.out.println(Thread.currentThread().getName()+"aquire Test Paper");
System.out.println(Thread.currentThread().getName()+"conducting Test");
Thread.sleep(3000);
System.out.println(Thread.currentThread().getName()+"Test done giving back question paper");
//giving back question paper
questionPaperPool.release();
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
}//yahan par ek HRManager yaani Anki505  four techleads two questionPaper toh pehle two techleads ek saath test phir kisi techlead 
//questionPaper release() toh other techleads aayenge  