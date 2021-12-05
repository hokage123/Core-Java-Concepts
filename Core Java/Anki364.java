 class Anki364
{
public static void main(String... s)
{
MyThread ct=new MyThread();
ct.start();
Thread.yield();
System.out.println("main");
}
}
class MyThread extends Thread
{
public MyThread()
{

}
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("counting"+i);
}
}
}