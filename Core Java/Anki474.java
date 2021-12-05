//there can be multiple generic datatype in a  generic class also
class Anki474<T,V,X>
{
T ob1;
V ob2;
X ob3;
Anki474(T o1,V o2,X o3)
{
ob1=o1;
ob2=o2;
ob3=o3;
}
void showTypes()
{
System.out.println("Type of T is"+ob1.getClass().getName());
System.out.println("Type of V is"+ob2.getClass().getName());
System.out.println("Type of X is"+ob3.getClass().getName());
}
T getOb1()
{
return ob1;
}
V getOb2()
{
return ob2;
}
X getOb3()
{
return ob3;
}
public static void main(String... s)
{
Anki474<Integer,String,Double> tgObj=new Anki474<>(88,"generics",2.4);
tgObj.showTypes();
int v=tgObj.getOb1();
System.out.println("value:"+v);
String str=tgObj.getOb2();
System.out.println("value:"+str);
double g=tgObj.getOb3();
System.out.println("value:"+g);
}
}