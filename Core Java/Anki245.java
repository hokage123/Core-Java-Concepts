class Anki245
{
public static void main(String... s)
{
Anki245 o=new Anki245();
o.partition(new int[]{-9,-8,1,7,8,9,-7,-4,11,3});
}
void partition(int c[])
{
int i,a[],b[],n=0,m=0,f=0,g=0;
for(i=0;i<c.length;i++)
{
if(c[i]<0)
n++;
else
m++;
}
a=new int[n];
b=new int[m];
for(i=0;i<c.length;i++)
{
if(c[i]<0)
{
a[f++]=c[i];
}
else
{
b[g++]=c[i];
}
}
sort(a,b);
}
void sort(int []a,int b[])
{
int i,j,u;
for(i=0;i<a.length;i++)
for(j=i;j<a.length;j++)
{
if(a[i]<a[j])
{
u=a[i];
a[i]=a[j];
a[j]=u;
}
}
for(i=0;i<b.length;i++)
for(j=1;j<i;j++)
{
if(b[i]<b[j])
{
u=b[i];
b[i]=b[j];
b[j]=u;
}
}
merge(a,b);
}
void merge(int a[],int b[])
	{
		int i,j,c[];
		j=a.length+b.length;
		c=new int[j];
		for(i=0;i<c.length;i++)
		{
			if(i<a.length)
				c[i]=a[i];
			else
			{
				j=i-a.length;
				c[i]=b[j];
			}
		}	
		for(i=0;i<c.length;i++)
			System.out.print(c[i]+"\t");
	}
}