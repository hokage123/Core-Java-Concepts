// annotation for Constructors only 
import java.lang.annotation.*;
import java.lang.reflect.*;
@Target(ElementType.CONSTRUCTOR)//metaannotation says annotation made can be applied for Constructor only
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnoc
{
int val();
}
class Anki488
{
@MyAnnoc(val=200)
Anki488()
{}
@MyAnnoc(val=100)
Anki488(int x)
{}
public static void read()
{
try
{
Class c=Anki488.class;
Constructor c1=c.getDeclaredConstructor();
Constructor c2=c.getDeclaredConstructor(int.class);
MyAnnoc anno=(MyAnnoc)c1.getAnnotation(MyAnnoc.class);
MyAnnoc anno1=(MyAnnoc)c2.getAnnotation(MyAnnoc.class);
System.out.println(anno.val());
System.out.println(anno1.val());
}
catch(Exception exc)
{
System.out.println(exc);
}
}
public static void main(String... g)
{
read();
}
}