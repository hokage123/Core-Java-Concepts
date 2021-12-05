import java.io.*;
class Car implements Externalizable
{
static int age;
String name;
int year;
/* *mandatory public no args constructor*/
public Car()
{
System.out.println("default");
}
Car(String S,int y)
{
name=S;
year=y;
age=10;
}
/* mandatory writeExternal method*/
public void writeExternal(ObjectOutput out)throws IOException
{
System.out.println("writeExternal");
out.writeObject(name);
out.writeInt(year);
out.writeInt(age);
}
/*mandatory readExternal method*/
public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException
{
System.out.println("readExternal");
name=(String)in.readObject();
year=in.readInt();
age=in.readInt();
}
public String toString()
{
return ("Name"+name+"\n"+"year"+year+"\n"+"age"+age);
}
}
public class Anki383
{
public static void main(String[] fu)
{
//create car obj
Car car=new Car("Mitbushi",2009);
Car newCar=null;
//serialize the car
try
{
FileOutputStream fo=new FileOutputStream("tmp.txt");
ObjectOutputStream so=new ObjectOutputStream(fo);
so.writeObject(car);
so.flush();
}
catch(Exception e)
{}
try
{
FileInputStream fi=new FileInputStream("tmp.txt");
ObjectInputStream si=new ObjectInputStream(fi);
newCar=(Car)si.readObject();
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("The Original car is");
System.out.println(car);
System.out.println("The newcar is");
System.out.println(newCar);
}
}