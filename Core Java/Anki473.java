//there can be two generic datatype  in generic class also
class Anki473<T,V>
{
T ob1;
V ob2;
Anki473(T o1,V o2)
{
ob1=o1;
ob2=o2;
}
void showTypes()
{
System.out.println("Type of T is"+ob1.getClass().getName());
System.out.println("Type of V is"+ob2.getClass().getName());
}
T getOb1()
{
return ob1;
}
V getOb2()
{
return ob2;
}
public static void main(String... s)
{
Anki473<Integer,String> tgObj=new Anki473<>(88,"generics");
tgObj.showTypes();
int v=tgObj.getOb1();
System.out.println("value:"+v);
String str=tgObj.getOb2();
System.out.println("value:"+str);
}
}