class Anki251
{
public static void main(String... s)
{
Anki251 m=new Anki251();
m.arraytonum(new int[]{1,2,3,4,5,6,7,8,9,0});
}
void arraytonum(int []a)
{ 
int i,u,integer=0;
for(i=0;i<a.length;i++)
{
u=a.length-i-1;
integer=integer+(a[u]*recnum(i));
}
System.out.println("im the number "+integer);
}
int recnum(int i)
{
if(i==0)
 return 1;
else
{
return 10*recnum(i-1);
}
}
}