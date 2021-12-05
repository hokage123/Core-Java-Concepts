import java.util.Scanner;
class Anki335
{
	static long[]a;
public static void main(String... s)
{
	int i;
	System.out.println("enter the num of nums u wanna enter");
a=new long[new Scanner(System.in).nextInt()];
System.out.println("enter the nums");
for(i=0;i<a.length;i++)
{
	a[i]=new Scanner(System.in).nextLong();
}
new Anki335().findNthgreatest(a);
}
void findNthgreatest(long[] b)
{
long count,max=b[0],min=b[0],d;
int i,j;
System.out.println("enter n for Nthgreatest one");
int n=new Scanner(System.in).nextInt();
for(count=0;count<(n-1);count++)
{
	max=b[0];
	min=b[0];
for(i=0;i<b.length;i++)
{
if(b[i]>max)
	max=b[i];
if(b[i]<min)
	min=b[i];
}
d=max;
for(i=0;i<b.length;i++)
{  		
		if((max==b[i]))
		{	
		b[i]=min;
		}
}
}
max=b[0];
for(i=0;i<b.length;i++)
{
if(b[i]>max)
	max=b[i];
}
System.out.println("theNthargest element is"+max);
}
}