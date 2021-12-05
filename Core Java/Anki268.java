class Anki268
{
public static void main(String... s)
{
String Str1=new String("Welcome to Tutorials Of String");
try
{
byte Str2[]=Str1.getBytes();
for(int i=0;i<Str2.length;i++)
System.out.println(Str2[i]);
}
catch(Exception e)
{
System.out.println("unsupported character set");
}
}
}