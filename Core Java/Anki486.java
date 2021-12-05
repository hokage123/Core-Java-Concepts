//annotation se do val return
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
String str();
int val();
}
class Anki486
{
//My Meth has now two arguments
@MyAnno(str="TwoParameters",val=19)//ab batana padega String me kaun val me kaun
public static void myMeth(String str,int i)
{
Anki486 ob=new Anki486();
try
{
Class c=ob.getClass();
//here parameter types are specified
Method m=c.getMethod("myMeth",String.class,int.class);
MyAnno anno=m.getAnnotation(MyAnno.class);
System.out.println(anno.str()+" "+anno.val());
}
catch(NoSuchMethodException exc)
{
System.out.println("Method not found");
}
}
public static void main(String... k)
{
myMeth("test",10);
} 
}