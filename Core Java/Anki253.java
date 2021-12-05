class Anki253
{
void seqWisePrint(int c[][])
{
int i,j,k,d=0,l=0;
for(k=0;k<(2*c.length-1);k++)
for(i=0;i<c.length;i++)
{	
for(j=0;j<c.length;j++)
{
	if(l%2!=0)
	{
		if((i+j)==k && i<=k)
System.out.print(c[i][j]+"\t");
if(k==i&&i<=c.length-1)
d=1;
else if(i==c.length-1 && j==c.length-1-j)
	d=1;
	}
	else
		{
		if((i+j)==k && i<=k)
System.out.print(c[j][i]+"\t");
if(k==i&&i<=c.length-1)
d=1;
else if(i==c.length-1 && j==c.length-1-j)
	d=1;
	}
}
if(d==1)
{
	System.out.print("\n");
	d=0;
	l++;//after ending l++
	break;
}
}
}
public static void main(String... s)
{
new Anki253().seqWisePrint(new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}});
}
}