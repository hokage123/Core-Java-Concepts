//jin class ke chizo ko val  via annotation deni hai us class ke corresponding object 1 method ke liye Method class 2 data mem ke liye Feild class 3 Constructor ke liye Constructor class 
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)//@Retention  indicate kis time par annotation read source code ke time par RetentionPolicy.SOURCE compileTime ke liye RetentionPolicy.CLASS runtime ke liye RetentionPolicy.RUNTIME//retention is one of metaannotation annotation banane ke kaam aane vala annotation
@interface MySingle//runtime par ye interface banega
{
int value();
}
class Anki484
{
@MySingle(100)
public static void myMeth()
{
Anki484 ob=new Anki484();
try
{
Method m=ob.getClass().getMethod("myMeth");
MySingle anno=m.getAnnotation(MySingle.class);//runtime par ek proxy class class jo MySingle ko implements and value() ko override krke integer val return  
Class c=anno.getClass();
System.out.println(c.getName());
Class inter[]=c.getInterfaces();
for(int i=0;i<inter.length;i++)
System.out.println(inter[i].getName());
Method m1=c.getMethod("value");
int x=anno.value();
System.out.println(x);//displays 100
}
catch(NoSuchMethodException e)
{
System.out.println("Method not found");
}
}
public static void main(String... s)
{
myMeth();
}
}