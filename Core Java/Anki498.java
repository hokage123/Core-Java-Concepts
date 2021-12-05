//lamdaExpression
//anonymous function without name without returntype
//example
//interface Math{int operator(int a,int b);}
//char chizo ko karvana hai operator(a,b) se sum multiply divide subtract toh char class yaa anonymous class benakar method override
//lamdaExpression ke wajah se koi class nahi banao charo ko body bhide dunga
//syntax (argument)->(body)
//Calculator
import java.lang.reflect.*;
class Anki498
{
public int operateBinary(int a,int b,IntegerMath op)
{
return op.operation(a,b);
}
public static void main(String... g)throws Exception
{
Anki498 myApp=new Anki498();
IntegerMath addition=(int a,int b)->a+b;//interface iska toh reference hoga nahi runtime par ek proxy class jisme lamdaExpression ke hisab se method override
IntegerMath subtraction=(a,b)->a-b;//(int a,int b) is optional
Class c=subtraction.getClass();
if(c.isInterface())
System.out.println("it is a interface");
if(c.isPrimitive())
System.out.println("it is primitive");
else if(c.isArray())
System.out.println("it is a array");
else
System.out.println("it is a class");
System.out.println(c.getName());
Class in[]=c.getInterfaces();
for(Class t:in)
System.out.println(t.getName());
Method m=c.getDeclaredMethod("operation",int.class,int.class);
System.out.println(m.getName());
System.out.println("40+2="+myApp.operateBinary(40,2,addition));
System.out.println("10-2="+myApp.operateBinary(10,2,subtraction));
}
}
interface IntegerMath
{
int operation(int a,int b);
}