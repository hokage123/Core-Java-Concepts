class Anki244
{ 
public static void main(String... s)
{ 
Anki244 h=new Anki244();
h.triangleb1d(new int[][]{{1,7,9},{5,4,6},{3,8,2}});
}
void triangleb1d(int a[][])
{
int c[],i,j,n=0,f=0,k=0;
for(i=0;i<a.length;i++)
for(j=0;j<a[0].length;j++)
{
if(j<=i)
n++;
}
c=new int[n];
for(i=0;i<a.length;i++)
for(j=0;j<a[0].length;j++)
{
if(j<=i)
c[f++]=a[i][j];
}
for(i=0;i<a.length;i++)
{	
for(j=0;j<a[0].length;j++)
{
if(j<=i)
{
	System.out.print(a[i][j]+"\t");
	k=k+a[i][j];
}
else
System.out.print(0+"\t");

}
System.out.print(k+"\n");
k=0;
}
int x=trianglebmax(c);
int y=trianglebmin(c);
int z=trianglebsum(c);
System.out.println("trianglebmax is"+x);
System.out.println("trianglebmin is"+y);
System.out.println("trianglebsum is"+z);
trianglebsort(c);
}
int trianglebmax(int []a)
{
int i,u=a[0];
for(i=0;i<a.length;i++)
{
if(a[i]>u)
u=a[i];
}
return u;
}
int trianglebmin(int []a)
{
int i,u=a[0];
for(i=0;i<a.length;i++)
{
if(a[i]<u)
u=a[i];
}
return u;
}
void trianglebsort(int []a)
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
System.out.println("sorted triangleb is");
for(i=0;i<a.length;i++)
System.out.println(a[i]);
}
int trianglebsum(int []a)
 {	
	int i,sum=0;
	 for(i=0;i<a.length;i++)
		 sum=sum+a[i];
		return sum;
 }
}