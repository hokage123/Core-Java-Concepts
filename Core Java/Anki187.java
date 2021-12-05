class Anki187
{
int max(int a[][])
{
int i,j,u=a[0][0];
for(i=0;i<a.length;i++)
for(j=0;j<a[i].length;j++)
{
if(a[i][j]>u)
u=a[i][j];
}
return u;
}
public static void main(String... s)
{
Anki187 t=new Anki187();
int y=t.max(new int[][]{{204,90,23},{10,86,3,9},{1290,67,89}});
System.out.println(y+"im the max");
}
}