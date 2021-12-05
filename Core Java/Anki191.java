class Anki191
{
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
			System.out.println(c[i]);
	}
int[] sort(int []a)
{
int i,j,u;
for(i=0;i<a.length-1;i++)
for(j=0;j<a.length-i-1;j++)
{
if(a[j]>a[j+1])
{
u=a[j+1];
a[j+1]=a[j];
a[j]=u;
}
}
return a;
}
public static void main(String... s)
{
Anki191 t=new Anki191();
int y[]=t.sort(new int[]{20,90,23,10,86,3,9});
int z[]=t.sort(new int[]{12,45,22,1,8,2,9});
t.merge(t.sort(new int[]{20,90,23,10,86,3,9}),t.sort(new int[]{12,45,22,1,8,2,9}));
System.out.println("second");
t.merge(y,z);
}
}