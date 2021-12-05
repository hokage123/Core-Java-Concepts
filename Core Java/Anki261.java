class Anki261
{
public static void main(String... s)
{
String S1="Hello";
String S2=new String("Hello");
boolean b=S1.equals(S2);//String ke andarki val compare isse mtlb nhi ki heap me ya pool me
System.out.println(b);
S1="Hello";
S2=new String("hello");
b=S1.equalsIgnoreCase(S2);//equals case senstive isliye equalsIgnorecase
System.out.println(b);
}
}