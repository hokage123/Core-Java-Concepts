//ArrayListSerialization1
import java.util.*;
import java.io.*;
class Anki523
{
public static void main(String... s)
{
ArrayList<Emp> al=new ArrayList<>();
al.add(new Emp(10));
al.add(new Emp(20));
al.add(new Emp(30));
try
{
FileOutputStream fos=new FileOutputStream("myfile");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(al);
oos.close();
fos.close();
System.out.println("after deserialization");
FileInputStream fin=new FileInputStream("myfile");
ObjectInputStream oin=new ObjectInputStream(fin);
ArrayList<Emp> al1=(ArrayList<Emp>)oin.readObject();
Iterator<Emp> i=al1.iterator();
while(i.hasNext())
{
Emp e=i.next();
System.out.println(e.x);
}
}
catch(Exception ioe)
{
ioe.printStackTrace();
}
}
}
class Emp implements Serializable
{
int x;
Emp(int x)
{
this.x=x;
}
}
//apne obj ko bhi ArrayList se serialized kr skte hai