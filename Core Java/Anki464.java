//boxing and unboxing after jdk1.5
class Anki464
{
public static void main(String... s)
{
int x=10;
Integer i=x;//boxing implicit operator overloading of =
int z=i;//unboxing implicit operator overloading of =
long l=10;
Long l1=l;
long l2=l1;
byte b=15;
Byte b1=b;
byte b2=b1;
double d=18.90;
Double d1=d;
double d2=d1;
float f=23.1f;
Float f1=f;
float f2=f1;
char c='a';
Character c1=c;
char c2=c1;
System.out.println(z+""+l2+b2+d2+f2+c2);
}
}