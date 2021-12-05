import java.io.*;
 class Emp extends Base implements Serializable
{
 private static final long serialVersionUID = -7051933319425097499L;
transient int a;
static int b=50;
String name;
int age;
int salary;
//Base b1=new Base();
public Emp(String name,int age,int a,int b,int z)
{
this.name=name;
this.age=age;
this.a=a;
//this.b=b;
this.z=z;
}
}
class Anki381
{
ObjectOutputStream dout;
public Anki381()
{
try
{
Emp e1=new Emp("ducat noida",10,5,20,100);
dout=new ObjectOutputStream(new FileOutputStream("ducat3.txt"));
dout.writeObject(e1);
dout.flush();
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String[] dr)
{
new Anki381();
}
}
class Base
{
int z;
}