//Class ka ref char cheezo ki reflected image
//1 primitive datatypes
//2 array
//3 interface
//4 class
class Anki437
{
public static void main(String... s)
{
Class clazz=int.class;
Class ar=int[].class;
Class c=java.io.Serializable.class;
boolean isInterface=clazz.isPrimitive();//agar true primitive ko represent
boolean isInterface1=c.isInterface();//agar true Interface ko represent
boolean isInterface2=ar.isArray();//agar true array ko represent
System.out.println("isPrimitive="+isInterface);
System.out.println("isInterface="+isInterface1);
System.out.println("isArray="+isInterface2);
}
} //agar kisi Class ke ref par isPrimitive(),isArray(),isInterface() teeno false de to wo class ko represent