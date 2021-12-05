//rules for accessing private things outside the class
//1 Corresponding class ka outside obj banao field hain Field ka method hain Method ka
//2 setAcessible(true) karo
//3 us class ka obj jiske data members
import java.lang.reflect.Field;//Field ko outside access
class Anki442
{
public static void main(String[] h)throws Exception
{
Class cls=Temp.class;
Temp t=new Temp();
//t.x=13;//allowed nahi final private 
Field field=cls.getDeclaredField("x");
field.setAccessible(true);
System.out.println(field);
System.out.println(field.get(t));//bina obj ke non static things access nahi
field.set(t,40);//x me value 40 daali final me outside se val
System.out.println(field.get(t));
}
}
class Temp
{
private final int x=199;
}