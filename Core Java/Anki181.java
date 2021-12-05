class Anki181
{
 
public static void main(String... s)
{
int i,j,x[][]={{10,20,30},{40,50,60,70},{10,20,30,40,50,60,70}};
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