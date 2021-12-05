class Anki250
{
public static void main(String... s)
{
Anki250 m=new Anki250();
m.arrayto1bin2int(new int[]{1,0,1,0,1,0,1,0,1,1});
}
void arrayto1bin2int(int []a)
{ 
int i,u,binary=0,integer=0;
for(i=0;i<a.length;i++)
{
u=a.length-i-1;
binary=binary+(a[u]*recbin(i));
}
for(i=0;i<a.length;i++)
{
u=a.length-i-1;
integer=integer+(a[u]*recdeci(i));
}
System.out.println("im binary "+binary);
System.out.println("im integer "+integer);
}
int recbin(int i)
{
if(i==0)
 return 1;
else
{
return 10*recbin(i-1);
}
}
int recdeci(int i)
{
if(i==0)
return 1;
else
{
return 2*recdeci(i-1);
}
}
}