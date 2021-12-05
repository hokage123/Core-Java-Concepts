import java.util.Scanner;
class Anki552
{
public static void main(String... s)
{
Anki552 a=new Anki552();
System.out.println("enter the String");
a.rtrim(new Scanner(System.in).nextLine());
}
void rtrim(String g)
{
int count=0;
char ch[];
System.out.println(g+"is entered String");
ch=g.toCharArray();
for(int i=0;i<ch.length;i++)
{
if((ch[i]!=' ')&&(ch[i]!='	'))
count=i;
}
String n=new String(ch,0,count+1);
System.out.println(n+"is trimed String");
}
}