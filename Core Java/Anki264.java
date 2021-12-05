//public static String CopyValueOf(char[] data) or public static String CopyValueOf(char[] data,int offset,int count)
class Anki264
{
public static void main(String... s)
{
char []Str1={'h','e','l','l','o',' ','w','o','r','l','d'};
String Str2="";
Str2=String.copyValueOf(Str1);
System.out.println("Returned value of"+Str2);
Str2=String.copyValueOf(Str1,2,6);
System.out.println("Returned value of"+Str2);
}
}