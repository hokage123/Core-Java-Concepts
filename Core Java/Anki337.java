class Shared
{
int x,y;
void show(String S,int a)
{
int x=a;
System.out.println("starting in method"+S+""+x);
try
{
Thread.sleep(2000);
}
catch(Exception e)
{}
System.out.println("exit from method"+S+""+x);
}
int add(int a,int b)
{
x=a;
y=b;
try
{
Thread.sleep(2000);
}
catch(Exception e)
{}
return x+y;
}
}
class Anki337
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
System.out.println("Thread1 sum of 10,20	"+S1.add(10,20));
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
System.out.println("Thread2 sum of 100,200	"+S1.add(100,200));
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
System.out.println("Thread3 sum of 1000,2000	"+S1.add(1000,2000));
}
}