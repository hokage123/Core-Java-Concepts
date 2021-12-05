class Shared
{
int flag=0;
int data=0;
synchronized public void submit()
{
flag=1;
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
data=10;
System.out.println("value submitted");
notify();
}
}
synchronized int withdraw()
{
if(flag==0)
{
try
{
System.out.println("sending into wait block");
wait();
}
catch(Exception e)
{}
}
return data;
} 
}
class Anki349
{
public static void main(String... s)
{
Shared st=new Shared();
Thread1 t1=new Thread1(st,"one");
Thread2 t2=new Thread2(st,"two");
}
}
class Thread1 extends Thread
{
Shared S;
Thread1(Shared S,String str)
{
super(str);
this.S=S;
start();
}
public void run()
{
System.out.println(S.withdraw());
}
}
class Thread2 extends Thread
{
Shared S;
Thread2(Shared S,String str)
{
super(str);
this.S=S;
start();
}
public void run()
{
S.submit();
}
}