import java.util.Scanner;
class Anki319 
{
static String A[][];
static int B[][];
public static void main(String... s)
{
A=new String[][]{{"one","two","three","four","five","six","seven","eight","nine"},{"ten","eleven","twelve","thirteen"
				,"fourteen","fifteen","sixteen","eighteen","nineteen"},{"twenty","thirty","forty","fifty","sixty"
				,"seventy","eighty","ninety"},{"Hundred","Thousand","Lakh","Crore","Arab","kharab","sankh"}};
B=new int[][]{{1,2,3,4,5,6,7,8,9},{10,11,12,13,14,15,16,17,18,19},{20,30,40,50,60,70,80,90}};
Anki319 v=new Anki319();
v.printnumtoword(A,B,new Scanner(System.in).nextLong());				
}
void printnumtoword(String C[][],int D[][],Long n)
{
int e[],h[],count=0,i=0,j=0,k=0,y=0;
long z=n;
String f[],g="";
for(;z!=0;z=z/10)
{
count++;
}
h=new int[count];
for(;n!=0;n=n/10)
{
h[i]=(int)(n%10);
i++;
}
y=1;
if(count>2)
y=count/2+1;
e=new int[y];
f=new String[y];
for(i=0;i<e.length;i++)
{
if(j!=2)
{
	if(count%2==0 && j==h.length-1)
	e[i]=h[j];
	else
	e[i]=h[j+1]*10+h[j];	
	j=j+2;
}
else
{
	e[i]=h[j];
	j=j+1;
}
}
for(i=0;i<e.length;i++)
{
for(j=0;j<D.length;j++)
for(k=0;k<D[j].length;k++)
{
if((e[i]%10!=0)&&(e[i]!=0))
{
	if(e[i]==D[j][k])
	f[i]=C[j][k];
else
{
	if(e[i]%10==D[j][k])
f[i]=C[j][k];
if((e[i]-(e[i]%10))==D[j][k])
f[i]=C[j][k]+f[i];
}
}
else
if(e[i]==D[j][k])
f[i]=C[j][k];
if(e[i]==0)
f[i]="";
}
}
for(i=0;i<e.length;i++)
{
if(f[i]!="" && i!=0)
g=f[i]+C[3][i-1]+g;
else
g=f[i]+g;
}
System.out.println(g);
}
}