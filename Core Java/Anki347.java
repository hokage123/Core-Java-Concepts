class Shared
{
int x,y;
Temp t=new Temp();
 void show3(String S,int a)
{
System.out.println("starting in method"+S+"");
synchronized(t)
{
t.dilToPagalHai(S);
}
}
}
class Anki347
{
public static void main(String... s)
{
Shared S1=new Shared();
CustomThread t1=new CustomThread(S1,"one");
CustomThread1 t2=new CustomThread1(S1,"two");
CustomThread2 t3=new CustomThread2(S1,"three");
}
} 
class CustomThread extends Thread
{
Shared S1;
public CustomThread(Shared S1,String str)
{
super(str);
this.S1=S1;
start();
}
public void run()
{
S1.show3(Thread.currentThread().getName(),10);
}
}
class CustomThread1 extends Thread
{
Shared S1;
public CustomThread1(Shared S1,String str)
{
super(str);
this.S1=S1;
start();
}
public void run()
{
S1.show3(Thread.currentThread().getName(),20);
}
}
class CustomThread2 extends Thread
{
Shared S1;
public CustomThread2(Shared S1,String str)
{
super(str);
this.S1=S1;
start();
}
public void run()
{
S1.show3(Thread.currentThread().getName(),30);
}
}
class Temp
{
void dilToPagalHai(String S)
{
System.out.println("starting haan main hoon dilToPagalHai"+S);
try
{
Thread.sleep(2000);
}
catch(Exception e)
{}
System.out.println("ending from dilToPagalHai"+""+S);
}
}