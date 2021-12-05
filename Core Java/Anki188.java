class Anki188
{
int min(int a[][])
{
int i,j,u=a[0][0];
for(i=0;i<a.length;i++)
for(j=0;j<a[i].length;j++)
{
if(a[i][j]<u)
u=a[i][j];
}
return u;
}
public static void main(String... s)
{
Anki188 t=new Anki188();
int y=t.min(new int[][]{{204,90,23},{10,86,3,9},{1905,1,89}});
System.out.println(y+"im the min");
}
}