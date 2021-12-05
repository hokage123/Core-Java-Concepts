class Anki247
{
public static void main(String... s)
{
Anki247 r=new Anki247();
r.count(new int[][]{{5,6,6,5,6},{2,3,4,6},{2,3,9,9}});
}
void count(int r[][])
{
int i,j,k,a[],count=0,f=0;
int l=0,u=0,b=0;
for(i=0;i<r.length;i++)
l=l+r[i].length;
a=new int[l];
for(i=0;i<r.length;i++)
for(j=0;j<r[i].length;j++)
{
a[b]=r[i][j];
b++;
}
System.out.println("frequency\tcount");
for(i=0;i<a.length;i++)
{
	count=0;
for(j=0;j<a.length;j++)
{
if(a[i]==a[j])
count++;
}
for(k=i+1;k<a.length;k++)
{
if(a[i]==a[k])
{
f=1;
break;
}
}
if(f==0)
{
System.out.println(a[i]+"\t\t"+count);
}
f=0;
}
}
}