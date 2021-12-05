//Generics
class Gen<T>//Generic class Gen T Generic datatype runtime par obj banate time decide
{
T ob;
Gen(T o)
{
ob=o;
}
T getOb()
{
return ob;
}
void showType()
{
Class c=ob.getClass();
System.out.println("Type of T is"+c.getName());
}
}
class Anki472
{
public static void main(String... g)
{
Gen<Integer> iOb=new Gen<Integer>(98);//primitive ke liye wrapper class obj banate time decide kyuki runtime par generic datatype obj me change
iOb.showType();
int v=iOb.getOb();
System.out.println("value:	"+v);
System.out.println();
Gen<Integer> iOb1=new Gen<Integer>(98);//primitive ke liye wrapper class obj banate time decide kyuki runtime par generic datatype obj me change
iOb1.showType();
int v1=iOb1.getOb();
System.out.println("value:	"+v1);
System.out.println();
Gen<String> strOb=new Gen<>("Generic ");//ab diamond<> operator bhi use kr skte hai
//Gen<String> strOb=new Gen<String>("Generic Test");//obj banate time decide String ki Integer
String str=strOb.getOb();
System.out.println("value:"+str);
Emp e1=new Emp();
Gen<Emp> eOb=new Gen<Emp>(e1);
eOb.showType();
Emp e2=eOb.getOb();
System.out.println("value"+e2.x);
//iOb=strOb;//val assign nahi kr skte kyuki datatype alag alag
iOb=iOb1;
}
}
class Emp
{
int x=200;
}