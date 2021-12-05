import java.lang.reflect.Constructor;
class Anki444
{
public static void main(String[] fy)
{
try
{
Class cl=Temp.class;
Constructor c=cl.getDeclaredConstructor();
c.setAccessible(true);
Temp t1=(Temp)c.newInstance();//newInstance() Constructor class ka method jo obj banata hai
t1.show();
Constructor c1=cl.getDeclaredConstructor(int.class);//parametrized ka liye
c1.setAccessible(true);
Temp t2=(Temp)c1.newInstance(10);//parametrized ka newInstance(int)
t2.show();
}
catch(Exception e)
{}
}
}
class Temp
{
private Temp()
{
System.out.println("Default Constructor");
}
void show()
{
System.out.println("show");
}
private Temp(int x)
{
System.out.println(x+"via parametrized constructor");
}
}
