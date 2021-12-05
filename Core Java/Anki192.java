class Anki192
{
 void union(int a[],int b[])
 {
 int i,j,l,c[],z=0,k=0,m=1,n=0;
  for(i=0;i<a.length;i++)
	  for(j=0;j<i;j++)
	  {
		  if(a[j]!=a[i]&&j!=i)
		  n=1;
	  else
		  if(a[j]==a[i]&&j==i)
			  n=1;
	  }
	  if(n==1)
	  {
		  m++;
		  n=0;
	  }
	  for(l=0;l<a.length;l++)
	   for(i=0;i<b.length;i++)
	for(j=0;j<i;j++)
	{	
  if(j<a.length)
		  {
			  if(b[j]!=b[i]&&b[j]!=a[l])
			n=1;
		  }
else
	if(b[j]!=b[i])
		n=1;
	  }
	  if(n==1)
	  {
		  m++;
		  n=0;
	  }
	  c=new int[m];
 for(i=0;i<m;i++)
 for(j=0;j<i;j++)
 {
 if(i<a.length)
 if(c[j]!=a[i])
 { 
z++;
c[j]=a[i];
 }
 else
 {
 k=i-z+1;
 if(c[j]!=b[k])
 {
	z++;
	c[j]=b[k];
 }
 }
 }
 for(i=0;i<c.length;i++)
 System.out.println(c[i]);
 }
public static void main(String... s)
{
Anki192 t=new Anki192();
t.union(new int[]{45,45,7,78,90},new int[]{89,45,7,91});
}
 }