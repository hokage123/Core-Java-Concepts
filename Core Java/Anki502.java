//agar premain de de main se pehle chal jayega isse obj ki size nikal skte hai par approximate obj Type arg leta hai size nikal ke deta hai
import java.lang.instrument.*;
class Anki502
{
public static void premain(String s,Instrumentation inst)
{
System.out.println("This is Premain");
A a1=new A();
long l=inst.getObjectSize(a1);
System.out.println(l);
}
public static void main(String... f)
{
System.out.println("Main of Pre");
}
}
class A
{
int x,y,z;
}
//steps
//1 compile the premain class
//create .mf file Main ki jagah Premain aage class jisme Premain hain
//2create jar
//jar -cmf abc.mf t2.jar Premain wali class.class
//3run jar
//java -javaagent:t2.jar Jiske main se pehle chalana us class ka naam