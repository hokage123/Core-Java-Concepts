class Anki269
{
public static void main(String... s)
{
String Str1=new String("welcome to the tutorials of String");
char[] Str2=new char[7];
char c[]=Str1.toCharArray();
try
{
Str1.getChars(2,9,Str2,0);
System.out.println("copied value =");
for(int i=0;i<Str2.length;i++)
System.out.println(Str2[i]);
System.out.println("");
for(int i=0;i<c.length;i++)
System.out.println(c[i]);
}
catch(Exception e)
{
System.out.println("Raised Exception");
}
}
}