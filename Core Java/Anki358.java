import java.util.Scanner;
class Anki358
{
static String ltrim(char c[])
{
int i,count=0,t=0;
char []d;
for(i=0;i<c.length;i++)
{
if((c[i]!=' ')&&(c[i]!='	'))
break;
count++;
}
d=new char[c.length-count];
count=0;
for(i=0;i<c.length;i++)
{
if(count==0)
{
if((c[i]!=' ')&&(c[i]!='	'))
count=1;
}
if(count==1)
d[t++]=c[i];
}
return new String(d);
}
public static void main(String... s)
{
System.out.println("Enter the String");
String Str=ltrim(new Scanner(System.in).nextLine().toCharArray());
System.out.print(Str);
System.out.print(":::is the ltrimed String ");
}
}