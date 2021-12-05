import java.util.Scanner;
class Anki516
{
static int b[],count;
public static void main(String... s)
{
System.out.println("Enter the size of num array");
b=new int[new Scanner(System.in).nextInt()];
System.out.println("enter elements of array");
for(int i=0;i<b.length;i++)
b[i]=new Scanner(System.in).nextInt();
countSteps(b);
System.out.println(count);
}
static void countSteps(int[] p)
{

int y[],i,n,j;
String[] d;
y=new int[p.length];
d=new String[p.length];
for(i=0;i<d.length;i++)
d[i]="";
for(i=0;i<y.length;i++)
y[i]=0;
for(i=0;i<y.length;i++)
{
n=p[i];
while(n!=0)
{
if(n%2==0)
{
n=n/2;
d[i]="M"+d[i];
}
else
{
n=n-1;
d[i]="I"+d[i];
}
}
}
for(i=0;i<d.length;i++)
for(j=0;j<d[i].length();j++)
{
if(d[i].charAt(j)=='I')
{
y[i]=y[i]+1;
count=count+1;
}
if(d[i].charAt(j)=='M')
{
y[i]=y[i]*2;
count=count+1;
}
}
for(i=0;i<d.length;i++)
System.out.println(y[i]);
}
}