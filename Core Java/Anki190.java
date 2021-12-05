class Anki190
{
void sort(int r[][])
{
int i,j,k,a[];
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
for(j=0;j<i;j++)
{
if(a[i]<a[j])
{
u=a[i];
a[i]=a[j];
a[j]=u;
}
}
for(i=0;i<a.length;i++)
System.out.println(a[i]);
}
public static void main(String... s)
{
Anki190 t=new Anki190();
t.sort(new int[][]{{20,90,23},{10,86,3,9},{14,5,1,11}});
}
}