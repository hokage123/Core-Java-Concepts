class Anki186
{
int min(int []a)
{
int i,u=a[0];
for(i=0;i<a.length;i++)
{
if(a[i]<u)
u=a[i];
}
return u;
}
public static void main(String... s)
{
Anki186 t=new Anki186();
int y=t.min(new int[]{204,90,23,10,86,3,1});
System.out.println(y+"im the min");
}
}