class Anki180
{
 
public static void main(String... s)
{
int i,j,x[][],z[]={3,5,7};
x=new int[3][];
for(i=0;i<x.length;i++)
x[i]=new int[z[i]];
for(i=0;i<x.length;i++)
for(j=0;j<x[i].length;j++)
x[i][j]=i+j;
for(i=0;i<x.length;i++)
{
System.out.println("\n");
for(j=0;j<x[i].length;j++)
System.out.println(x[i][j]);
}
for(i=0;i<x.length;i++)
{
System.out.println("\n");
for(int k:x[i])
System.out.println(k);
}
}
}