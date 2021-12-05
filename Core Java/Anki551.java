//CopyOnWriteCopyOnWriteArrayList ki kahani
//ArrayListSolution
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
class Anki551
{
public static void main(String... d)
{
CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<>();
al.add("a");
al.add("b");
al.add("c");
try
{
ArrayListTh1 alt1=new ArrayListTh1(al);
Thread tt1=new Thread(alt1);
ArrayListTh2 alt2=new ArrayListTh2(al);
Thread tt2=new Thread(alt2);
tt1.setPriority(10);
tt2.setPriority(1);
tt1.start();
tt2.start();
tt1.join();
tt2.join();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
System.out.println(al);
}
}
class ArrayListTh1 implements Runnable
{
CopyOnWriteArrayList<String> al;
ArrayListTh1(CopyOnWriteArrayList<String> al)
{
this.al=al;
}
public void run()
{
try
{
Iterator<String> i=al.iterator();
while(i.hasNext())
{
String str=(String)i.next();
System.out.println("Name:"+str);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println("Exception"+e);
}
}
}
class ArrayListTh2 implements Runnable
{
CopyOnWriteArrayList<String> al;
ArrayListTh2(CopyOnWriteArrayList<String> al)
{
this.al=al;
}
public void run()
{
try
{
for(int i=0;i<5;i++)
{
System.out.println("sss");
al.add("first");
al.add("second");
Thread.sleep(2000);
}
}
catch(Exception e)
{
	System.out.println("Exception:"+e);
}
}
}