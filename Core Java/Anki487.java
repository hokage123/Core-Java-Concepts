//annotation applied to data member
import java.lang.annotation.*;
import java.lang.reflect.*;
@Target(ElementType.FIELD)//@Target is metaannotation which indicates annotation is appplied to which type if it is not written annotation is applied to every type
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno11
{
int val();
}
class Anki487
{
@MyAnno11(val=100)
public int x;
public static void myMeth()
{
Anki487 ob=new Anki487();
try
{
Class c=ob.getClass();
Field f=c.getField("x");
MyAnno11 anno=f.getAnnotation(MyAnno11.class);
System.out.println(anno.val());
}
catch(Exception exc)
{
System.out.println(exc);
}
}
public static void main(String... s)
{
myMeth();
}
}