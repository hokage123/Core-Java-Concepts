//default values in annotation
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
String str()default "Testing";
int val()default 9000;
}
class Anki489
{
//@MyAnno(str="hello",val=1000)
@MyAnno
public static void myMeth()
{
Anki489 ob=new Anki489();
try
{
Class c=ob.getClass();
Method m=c.getMethod("myMeth");
MyAnno anno=m.getAnnotation(MyAnno.class);
System.out.println(anno.str()+"  "+anno.val());
}
catch(NoSuchMethodException exec)
{
System.out.println("method not found");
}
}
public static void main(String... s)
{
myMeth();
}
}