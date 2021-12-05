import java.util.Scanner;
class Anki353
{
	
static int charCount(char c[])
{
int i,count=0;
for(i=0;i<c.length;i++)
if((c[i]!=' ')&&(c[i]!='	'))
count++;
return count;
}
public static void main(String... s)
{
System.out.println("enter the String");
int count=charCount(new Scanner(System.in).nextLine().toCharArray());
System.out.println("num of characters in given string are "+count);
}
}