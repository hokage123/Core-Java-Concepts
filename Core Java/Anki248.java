class Anki248
{
public static void main(String... s)
{
Anki248 r=new Anki248();
r.firstnonrepeting(new int[][]{{5,6,6,5,6},{2,3,6},{2,3,9,9,10}});
}
void firstnonrepeting(int r[][])
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
if(f==0&&count==1)
{
System.out.println(a[i]+" is the firstnonrepeting");
break;
}
f=0;
}
}
}