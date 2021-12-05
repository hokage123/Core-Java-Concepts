class Anki351
{
void printSumMatrix(int a[][])
{
int b[][],i,j,r;
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.print("\n");
}
b=new int[a.length+1][a.length+1];
for(r=0;r<a.length;r++)
for(i=0;i<a.length;i++)
for(j=0;j<a[i].length;j++)
{
if(j==r)
b[0][r]=b[0][r]+a[i][j];
}
for(r=0;r<a.length;r++)
for(i=0;i<a.length;i++)
for(j=0;j<a[i].length;j++)
{
if(i==r)
b[r+1][a.length]=b[r+1][a.length]+a[i][j];
}
for(i=0;i<a.length;i++)
for(j=0;j<a[i].length;j++)
{
if(i==(a.length-1-j))
b[0][a.length]=b[0][a.length]+a[i][j];
}
for(i=0;i<a.length;i++)
for(j=0;j<a[i].length;j++)
{
b[i+1][j]=b[i+1][j]+a[i][j];
}
for(i=0;i<b.length;i++)
{
for(j=0;j<b[i].length;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.print("\n");
}
}
public static void main(String... s)
{
new Anki351().printSumMatrix(new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}});
}
}