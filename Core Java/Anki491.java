//getAnnotations() for more than one annotation
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
String str();
int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface What
{
String description();
}
@What(description="Annotation test class")
@MyAnno(str="class",val=100)
class Anki491
{
@What(description="Annotation test method")
@MyAnno(str="method",val=100)
public static void myMeth()
{
Anki491 ob=new Anki491();
try
{
Annotation annos[]=ob.getClass().getAnnotations();
MyAnno mn=ob.getClass().getAnnotation(MyAnno.class);
System.out.println(mn.getClass().getName());
System.out.println(mn.str());
System.out.println(mn.val());
//display  all annotations for Anki491
System.out.println("All annotations for Anki491");
for(int i=0;i<annos.length;i++)
System.out.println(annos[i]);
System.out.println();
//display all annotations for myMeth
Method m=ob.getClass().getMethod("myMeth");
annos=m.getAnnotations();
System.out.println("All annotations for myMeth");
for(int i=0;i<annos.length;i++)
System.out.println(annos[i]);
}
catch(NoSuchMethodException e)
{
System.out.println(e);
}
}
public static void main(String... s)
{
myMeth();
}
}