import java.util.Scanner;
class Anki357
{
static boolean palindrome(char c[])
{
int i,j,count=0;
char d[];
String Str;
d=new char[c.length];
for(i=0;i<c.length;i++)
d[i]=c[c.length-1-i];
for(i=0;i<c.length;i++)
{
	
if((c[i]>='A') && (c[i]<='Z'))
	c[i]=(char)(c[i]+32);
if((d[i]>='A') && (d[i]<='Z'))
		d[i]=(char)(d[i]+32);
}
for(i=0;i<c.length;i++)
{
if(c[i]==d[i])
count++;
}
if(count==c.length)
return true;
else
return false;
}
public static void main(String... s)
{
System.out.println("Enter the string");
boolean b=palindrome(new Scanner(System.in).nextLine().toCharArray());
if(b==true)
System.out.println("i'm palindrome");
}
}