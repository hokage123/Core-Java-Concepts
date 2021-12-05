//toString() ko override ke sath sath overload primitive val ke corresponding string me convert
class Anki462
{
public static void main(String... y)
{
byte p=12;
String s=Integer.toString(10);
String s1=Boolean.toString(true);
String s2=Long.toString(10);
String s3=Byte.toString(p);
String s4=Double.toString(10.987);
 String s5=Float.toString(10.1f);
String s6=Character.toString('a');
System.out.println(s+s1+s2+s3+s4+s5+s6);
}
}