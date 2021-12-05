class Anki263
{
public static void main(String... s)
{
String Str1="Not immutable";
String Str2="String are immutable";
StringBuffer Str3=new StringBuffer("Not immutable");
boolean result=Str1.contentEquals(Str3);
System.out.println(result);
result=Str2.contentEquals(Str3);
System.out.println(result);//do alag classes ke obj ko ke andar ki String compare
}
}