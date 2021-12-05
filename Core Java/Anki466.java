//jaisa String me obj via heap via literal vaisa hi yaha bhi
class Anki466
{
public static void main(String... g)
{
Integer i1=new Integer(10);
Integer i2=new Integer(10);
boolean r=i1==i2;
System.out.println(r);
Integer i3=127;//after 127 via literal also obj is not shared
Integer i4=127;
r=i3==i4;
System.out.println(r);
}
} 