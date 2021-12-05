//dusri class me annotation dusri class se read
import java.lang.annotation.*;
import java.lang.reflect.*;
class Anki485
{
public static void readAnnotation()
{
Anki484 ob=new Anki484();
try
{
Method m=ob.getClass().getMethod("myMeth");
MySingle anno=m.getAnnotation(MySingle.class);
int x=anno.value();
System.out.println(x);
System.out.println(anno.getClass().getName());
}
catch(NoSuchMethodException e)
{
System.out.println("method not Found");
}
}
public static void main(String... g)
{
readAnnotation();
}
}