class Anki249
{
public static void main(String... s)
{
Anki249 a=new Anki249();
a.max1(new int[][]{{1,0,1,0,1,0,1},{0,0,0,1,1,1,1},{0,1,1,1,1,1,0}});
}
void max1(int a[][])
{
int i,j,count=0,max=0,u=0;
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
if(a[i][j]==1)
count++;
}
if(max<count)
max=count;
count=0;
}
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
if(a[i][j]==1)
count++;
}
if(max==count)
u=i;
count=0;
}
System.out.println("max number of 1 is "+max);
System.out.println("the row with max1 is ");
for(int k:a[u])
	System.out.print(k+"\t");
}
}