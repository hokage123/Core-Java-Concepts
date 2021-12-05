import java.util.Scanner;
class Anki323
{
	static double[]a,b;
	static int[]c;
void meanmedianmode(double b[])
{
int i=0,j=0,h=0,count;
double mean=0,median,mode=0,d;
for(i=0;i<b.length;i++)
for(j=i+1;j<b.length;j++)
{
if(b[i]<b[j])
{
d=b[i];
b[i]=b[j];
b[j]=d;
}
}
for(i=0;i<b.length;i++)
mean=mean+b[i];
mean=mean/b.length;
if(b.length%2==0)
	median=(b[(b.length/2)-1]+b[b.length/2])/2;
else
	median=b[((b.length+1)/2)-1];
for(i=0;i<b.length;i++)
{
	count=1;
for(j=i+1;j<b.length;j++)
{
if(b[i]==b[j])
{
count++;
}
}
if(count>h)
{
	h=count;
	mode=b[i];
}
}
System.out.println("mean of nums is"+mean);
System.out.println("median of num is"+median);
System.out.println("mode of num is"+mode);
}
public static void main(String... s)
{
	int i,n,d=0,t=0,j;
	System.out.println("enter 1 for only data entry and 2 to enter data frequency both");
	try
	{
	n=new Scanner(System.in).nextInt();
	if(n==1)
	{	
	System.out.println("enter the num u wanna enter");
	a=new double[new Scanner(System.in).nextInt()];
	for(i=0;i<a.length;i++)
	{
		a[i]=new Scanner(System.in).nextDouble();
	}
	}
	if(n==2)
	{
	System.out.println("enter the num u wanna enter");
	b=new double[new Scanner(System.in).nextInt()];	
	
			for(i=0;i<b.length;i++)
				b[i]=new Scanner(System.in).nextDouble();
			System.out.println("enter also frequencies");
				c=new int[b.length];
			for(i=0;i<b.length;i++)
				c[i]=new Scanner(System.in).nextInt();
			for(i=0;i<b.length;i++)
				d=d+c[i];
				a=new double[d];
				for(i=0;i<b.length;i++)
					for(j=0;j<c[i];j++)
						a[t++]=b[i];
	}
	for(i=0;i<a.length;i++)
		System.out.println(a[i]);
new Anki323().meanmedianmode(a);
	}
	catch(NullPointerException e)
	{
		System.out.println("madarchod 1 yaa 2 daal");
	}
}
}