//converting wrapper obj into String toString() ko override krke 
class Anki461
{
public static void main(String... y)
{
byte p=12;
Integer i=new Integer(10);
String s=i.toString();
Boolean b1=new Boolean(true);
String s1=b1.toString();
Long l=new Long(10);
String s2=l.toString();
Byte x=new Byte(p);
String s3=x.toString();
Double d=new Double(10.987);
String s4=d.toString();
Float f=new Float(10.1f);
String s5=f.toString();
Character c=new Character('a');
String s6=c.toString();
System.out.println(s+s1+s2+s3+s4+s5+s6);
}
}