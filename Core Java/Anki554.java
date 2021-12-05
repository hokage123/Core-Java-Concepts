import java.util.Scanner;
class Anki554
{
public static void main(String... s)
{
Anki554 a=new Anki554();
System.out.println("enter the String");
a.squeeze(new Scanner(System.in).nextLine());
}
void squeeze(String g)
{
int i=0,count1=0,count=0;
char ch[],b[];
System.out.println(g+"is entered String");
ch=g.toCharArray();
for(i=0;i<ch.length;i++)
{
if((ch[i]!=' ')&&(ch[i]!='	'))
count++;
}
b=new char[count];
count=0;
for(i=0;i<ch.length;i++)
{
if((ch[i]!=' ')&&(ch[i]!='	'))
{
b[count]=ch[i];
count++;
}
}
String n=new String(b);
System.out.println(n+"is squeezeed String");
}
}