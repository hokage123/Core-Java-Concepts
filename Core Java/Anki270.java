//public int indexOf(char ch),public int indexOf(char ch,int index),public int indexOf(String s),public int indexOf(String s,int index) 
class Anki270
{
public static void main(String... s)
{
String Str=new String("welcome to tutorials");
String Substr1=new String("tutorials");
String Substr2=new String("sutorials");
System.out.println("Found index :");
System.out.println(Str.indexOf('o'));
System.out.println("Found index :");
System.out.println(Str.indexOf('o',5));
System.out.println("Found index :");
System.out.println(Str.indexOf(Substr1));
System.out.println("Found index :");
System.out.println(Str.indexOf(Substr1,5));
System.out.println("Found index :");
System.out.println(Str.indexOf(Substr2));
}
}