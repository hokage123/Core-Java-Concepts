class Anki189
{
void sort(int []a)
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
for(i=0;i<a.length;i++)
System.out.println(a[i]);
}
public static void main(String... s)
{
Anki189 t=new Anki189();
t.sort(new int[]{20,90,23,10,86,3,9});
}
}