import java.util.Scanner;
class Anki356
{
static String reverse(char c[])
{
int i;
char d[];
String Str;
d=new char[c.length];
for(i=0;i<c.length;i++)
d[i]=c[c.length-1-i];
Str=new String(d);
return Str;
}
public static void main(String... s)
{
System.out.println("Enter the string");
String rev=reverse(new Scanner(System.in).nextLine().toCharArray());
System.out.println("the reversed String is:::");
System.out.println(rev);
}
}