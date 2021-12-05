class Anki271
{
public static void main(String... s)
{
String Str=new String("welcome to tutorials");
String Substr1=new String("tutorials");
String Substr2=new String("sutorials");
System.out.println("Found index :");
System.out.println(Str.lastIndexOf('o'));
System.out.println("Found index :");
System.out.println(Str.lastIndexOf('o',5));
System.out.println("Found index :");
System.out.println(Str.lastIndexOf(Substr1));
System.out.println("Found index :");
System.out.println(Str.lastIndexOf(Substr1,5));
System.out.println("Found index :");
System.out.println(Str.lastIndexOf(Substr2));
}
}