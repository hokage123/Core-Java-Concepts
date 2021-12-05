//public String[] split(String regex,int limit),public String[] split(String regex)
class Anki273
{
public static void main(String... s)
{
int i;
String Str=new String("Welcome-to-Tutorial-of-String");
System.out.println("Return value:");
String S[]=Str.split("-",2);
for(i=0;i<S.length;i++)
System.out.println(S[i]);
System.out.println("");
System.out.println("Return value:");
 S=Str.split("-",3);
for(i=0;i<S.length;i++)
System.out.println(S[i]);
System.out.println("");
System.out.println("Return value:");
 S=Str.split("-",0);
for(i=0;i<S.length;i++)
System.out.println(S[i]);
System.out.println("");
System.out.println("Return value:");
 S=Str.split("-");
for(i=0;i<S.length;i++)
System.out.println(S[i]);
System.out.println("");
}
}