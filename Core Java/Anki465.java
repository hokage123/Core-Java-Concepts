//Wrapper classes have also implemented Comparable interface and also overridden compareTo() method works like String
//>0 if first greater <0 if second  greater =0 if both are equal
class Anki465
{
public static void main(String... s)
{
Integer i1=new Integer(10);
Integer i2=new Integer(20);
int r=i1.compareTo(i2);
System.out.println(r);
Character c1=new Character('a');
Character c2=new Character('A');
r=c1.compareTo(c2);
System.out.println(r);
}
}