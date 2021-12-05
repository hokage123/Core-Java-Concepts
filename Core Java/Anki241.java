class Anki241
{
public static void main(String... s)
{
Anki241 h=new Anki241();
h.matrixtranspose(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
}
void matrixtranspose(int a[][])
{
int c[][],i,j;
c=new int[a[0].length][a.length];
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
c[j][i]=a[i][j];
}
}for(i=0;i<a[0].length;i++)
{
for(j=0;j<a.length;j++)
{
System.out.print(c[i][j]);
System.out.print("\t");
}
System.out.print("\n");
}
}
}