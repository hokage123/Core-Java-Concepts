//boxing and unboxing before jdk1.5
class Anki463
{
public static void main(String... s)
{
int x=10;
Integer i=new Integer(x);//boxing
int z=i.intValue();//unboxing type typeValue() method was provided before jdk1.5 to unbox
long l=10;
Long l1=new Long(l);
long l2=l1.longValue();
byte b=15;
Byte b1=new Byte(b);
byte b2=b1.byteValue();
double d=18.90;
Double d1=new Double(d);
double d2=d1.doubleValue();
float f=23.1f;
Float f1=new Float(f);
float f2=f1.floatValue();
char c='a';
Character c1=new Character(c);
char c2=c1.charValue();
System.out.println(z+""+l2+b2+d2+f2+c2);
}
}