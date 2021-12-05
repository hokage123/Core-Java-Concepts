//private methods ko outside the class
import java.lang.reflect.Method;
class Anki443
{
public static void main(String[] g)throws Exception
{
GetMethods m1=new GetMethods();
Class clazz=m1.getClass();
Method method=clazz.getMethod("div",new Class[]{int.class,int.class});//1 jitne args  hai array Class type ka banakar pass
//Method method=clazz.getDeclaredMethod("div",int.class,int.class);//2 method ka naam aage args pass
method.setAccessible(true);
System.out.println("Method Name"+method.getName());
Double z=(Double)method.invoke(m1,10,5);
System.out.println(z.doubleValue());
}
}
class GetMethods
{
private double div(int numberA,int numberB)
{
return numberA/numberB;
}
}