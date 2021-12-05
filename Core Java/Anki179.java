class Anki179
{
 
public static void main(String... s)
{
int i,j,x[][];
x=new int[3][];
x[0]=new int[3];
x[1]=new int[5];
x[2]=new int[7];
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