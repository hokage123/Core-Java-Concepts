class Anki257
{
public static void main(String... s)
{
String S="good";
S=S+"Morning";//String immutable hai obj kaise change refvar dusre obj ko point krne laga obj "good" abhi bhi vahi
System.out.println(S);
String S1="Hello";
String S2=S1+"World";
System.out.println(S1);
System.out.println(S2);
if(S1==S2)
	System.out.println("String obj can be changed");
}
}