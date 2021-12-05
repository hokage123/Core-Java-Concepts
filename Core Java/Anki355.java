import java.util.Scanner;
class Anki355
{
static int wordCount(char c[])
{
int i,count=0;
for(i=0;i<c.length;i++)
{
	if(i==0)
	{
	if((c[i]!=' ')&&(c[i]!='	'))
	count++;
	}

else if(((c[i-1]==' ')||(c[i-1]=='	'))&&((c[i]!='	')&&(c[i]!=' ')))
	count++;
}
return count;
}
public static void main(String... s)
{
System.out.println("enter the String");
int count=wordCount(new Scanner(System.in).nextLine().toCharArray());
System.out.println("num of words in given string are "+count);
}
}