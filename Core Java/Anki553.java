import java.util.Scanner;
class Anki553
{
public static void main(String... s)
{
Anki553 a=new Anki553();
System.out.println("enter the String");
a.alltrim(new Scanner(System.in).nextLine());
}
void alltrim(String g)
{
int i=0,count1=0,count=0;
char ch[];
System.out.println(g+"is entered String");
ch=g.toCharArray();
for(i=0;i<ch.length;i++)
{
if((ch[i]==' ')||(ch[i]=='	'))
{
count1++;
}
else
	break;
}
for(i=0;i<ch.length;i++)
{
if((ch[i]!=' ')&&(ch[i]!='	'))
count=i;
}
String n=new String(ch,count1,(count+1-count1));
System.out.println(n+"is trimed String");
}
}