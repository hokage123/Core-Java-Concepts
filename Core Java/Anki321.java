class Anki321
{
static int []a;
int hcf(int []b,int c)
{
int i,j,count=0,hcf=0;
for(i=1;i<=c;i++)
{
	count=0;
for(j=0;j<b.length;j++)
{
if((b[j]%i)!=0)
count=1;
}
if(count==0)
hcf=i;
}
return hcf;
}
public static void main(String... s)
{
Anki321 t=new Anki321();
a=new int[]{51,9,36,36,90,39};
int i,u=a[0];
for(i=0;i<a.length;i++)
{
if(a[i]<u)
u=a[i];
}
int y=t.hcf(a,u);
System.out.println("the hcf of num "+y);
}
}