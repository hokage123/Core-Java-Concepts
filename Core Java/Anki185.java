class Anki185
{
int max(int []a)
{
int i,u=a[0];
for(i=0;i<a.length;i++)
{
if(a[i]>u)
u=a[i];
}
return u;
}
public static void main(String... s)
{
Anki185 t=new Anki185();
int y=t.max(new int[]{204,90,23,10,86,3,9});
System.out.println(y+"im the max");
}
}