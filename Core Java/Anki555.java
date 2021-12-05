import java.util.Scanner;
class Anki555
{
public static void main(String... s)
{
Anki555 a=new Anki555();
System.out.println("enter the String");
int count=a.vowelCount(new Scanner(System.in).nextLine());
System.out.println("no of Vowels are"+count);
}
int vowelCount(String s)
{
int count=0;
char ch[];
ch=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
if((ch[i]=='a')||(ch[i]=='A')||(ch[i]=='e')||(ch[i]=='E')||(ch[i]=='O')||(ch[i]=='o')||(ch[i]=='i')||(ch[i]=='I')||(ch[i]=='u')||(ch[i]=='U'))
count++;
}
return count;
//System.out.println("no of Vowels are"+count);
}
}