class Anki246
{
public static void main(String... s)
{
Anki246 a=new Anki246();
a.countme(new int[][]{{1,0,1,0},{0,0,0,1},{0,1,1,1}});
}
void countme(int a[][])
{
int i,j,count=0;
System.out.print("frequency\tcount\n");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
if(a[i][j]==1)
count++;
}
System.out.print("1\t\t"+count+"\n");
count=0;
}
}
}