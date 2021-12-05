import java.util.Scanner;
class Anki322
{
static long []a;
long lcm(long []b,long c)
{
int i,j,count=0,d[],f[],t=0,e=0;
int g=0,h=0,k=0;
long lcm=1;
for(i=2;i<=c;i++)
	{
	count=0;
	for(j=2;j<=i/2;j++)
	{
		if(i%j==0)
		{	
			count++;
			break;
		}
	}
	if(count==0)
		e++;
	}
	d=new int[e];
	for(i=2;i<=(int)c;i++)
	{
	count=0;
	for(j=2;j<=i/2;j++)
	{
		if(i%j==0)
		{
			count++;
			break;		
		}
	}
	if(count==0)
		d[t++]=i;
	
	}
	for(i=0;i<d.length;i++)
	{
		h=countMax(b,d[i]);
		if(h>k)
			k=h;
	}
	for(;k>0;k--)
	{
	for(i=0;i<d.length;i++)
	{
		count=0;
		t=0;
		g=0;
		for(j=0;j<b.length;j++)
		{
			if((b[j]%d[i])!=0)
				count++;
		}
		for(j=0;j<b.length;j++)
		{
			if(count==b.length)
				break;
			if((b[j]%d[i])==0)
			{
				b[j]=(b[j]/d[i]);
				t++;
			}
		}
		if(t>0)
			lcm=lcm*d[i];
	}
	}
	return lcm;
	
}
 int countMax(long []b,int c)
{
	int count=0,m=0,i;
	long d;
	for(i=0;i<b.length;i++)
	{
		d=b[i];
	while((d%c)==0)
	{
		d=(d/c);
		count++;
	}
	if(count>m)
		m=count;
	}
	return m;
}
public static void main(String... s)
{
	int i;
Anki322 t=new Anki322();
System.out.println("enter the num u wanna enter");
a=new long[new Scanner(System.in).nextInt()];
for(i=0;i<a.length;i++)
{
	a[i]=new Scanner(System.in).nextLong();
}
long u=a[0];
for(i=0;i<a.length;i++)
{
if(a[i]>u)
	u=a[i];
}
long y=t.lcm(a,u);
System.out.println("the lcm of num "+y);
}
}