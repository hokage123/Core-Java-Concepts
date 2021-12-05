//jo runtime par MarkerInterface vo MarkerAnnotation kehlate hai 
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{}
class Anki490
{
@MyMarker
public static void myMeth()
{
Anki490 ob=new Anki490();
try
{
Method m=ob.getClass().getMethod("myMeth");
//determine the annotation is present
if(m.isAnnotationPresent(MyMarker.class))
System.out.println("my marker is present");
}
catch(NoSuchMethodException exc)
{}
}
public static void main(String... j)
{
myMeth();
}
}