class Anki195
{
public static void main(String... s)
{
Anki195 h=new Anki195();
h.matrixadd(new int[][]{{1,2,3},{4,5,6},{7,8,9}},new int[][]{{9,8,7},{6,5,4},{3,2,1}});
h.matrixmulti(new int[][]{{1,2},{3,4},{5,6},{7,8}},new int[][]{{1,2,3,4,5},{5,4,3,2,1}});
}
void matrixadd(int a[][],int b[][])
{
int c,i,j;
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
c=a[i][j]+b[i][j];
System.out.print(c);
System.out.print("\t");
}
System.out.print("\n");
}
}
void matrixmulti(int a[][],int b[][])
{
	int c=0,i,j,k;
	for(i=0;i<a.length;i++)
	{
	for(j=0;j<b[0].length;j++)
	{
	
	for(k=0;k<a[i].length;k++)
	c=c+a[i][k]*b[k][j];
		System.out.print(c);
		System.out.print("\t");
		c=0;
	}
		System.out.print("\n");
	}
}
}