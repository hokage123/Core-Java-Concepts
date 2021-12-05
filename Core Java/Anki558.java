import java.util.Scanner;
class Anki558
{
static int counts[];
public static void main(String... s)
{
Anki558 a=new Anki558();
System.out.println("enter the String");
a.frequencyCount(new Scanner(System.in).nextLine());
}
void frequencyCount(String u)
{
String strings[],strs[],p=null;
int count=0,count1=0,k=0,i,j;
char ch[];
ch=u.toCharArray();
for(i=0;i<ch.length;i++)
{
if(((i!=0)&&((ch[i-1]==' ')||(ch[i-1]=='	'))&&((ch[i]!=' ')&&(ch[i]!='	')))||((i==0)&&((ch[i]!=' ')&&(ch[i]!='	'))))
count++;
}
strings=new String[count];
for(i=0;i<ch.length;i++)
{
	count1=0;
if(((i!=0)&&((ch[i-1]==' ')||(ch[i-1]=='	'))&&((ch[i]!=' ')&&(ch[i]!='	')))||((i==0)&&(ch[i]!=' ')&&(ch[i]!='	')))
{
for(j=i;j<ch.length;j++) 
{
if((ch[j]!=' ')&&(ch[j]!='	'))
	count1++;
else
{
strings[k]=new String(ch,i,count1);
k++;
break;
}
if(j==(ch.length-1))
{
	strings[k]=new String(ch,i,count1);
	k++;
	break;
}
	}
}
}
for(i=0;i<strings.length;i++)
System.out.println(strings[i]);
strs=duplicacyremoval(strings);
for(i=0;i<counts.length;i++)
	System.out.println(strs[i]+counts[i]);
for(i=0;i<counts.length;i++)
for(j=0;j<i;j++)
{
if(counts[j]<counts[j+1])
{
p=strs[j+1];
strs[j+1]=strs[j];
strs[j]=p;
}
}
for(i=0;i<counts.length;i++)
for(j=0;j<i;j++)
{
if(counts[j]<counts[j+1])
{
count=counts[j+1];
counts[j+1]=counts[j];
counts[j]=count;
}
}
for(i=0;i<counts.length;i++)
System.out.println(strs[i]+"	"+counts[i]);
}

String[] duplicacyremoval(String[] strings)
{
String str[];
char ch[][];
ch=new char[strings.length][];
int i,d=0,count=0,c=0,count1=0,k,j,l=0;
for(i=0;i<strings.length;i++)
{
ch[i]=strings[i].toCharArray();
}
for(i=0;i<strings.length;i++)
{
	count1=0;
for(j=0;j<strings.length;j++)
{
	d=j;
if(i==0)
break;
else if((ch[i].length==ch[j].length)&&(i!=0))
{
for(k=0;k<ch[j].length;k++)
{
if(ch[i][k]==ch[j][k])
count1++;
}
}
if((count1==ch[i].length)&&(i!=j))
{
	c=count1;
	count1=0;
	break;
}
}
if((count1!=ch[i].length)&&(c==0)&&(d!=i))
count++;
c=0;
}
System.out.println(count);
str=new String[count];
counts=new int[count];
for(i=0;i<counts.length;i++)
counts[i]=1;
for(i=0;i<strings.length;i++)
{
	count1=0;
for(j=0;j<strings.length;j++)
{
	d=j;
if(i==0)
break;
else if((ch[i].length==ch[j].length)&&(i!=0))
{
for(k=0;k<ch[j].length;k++)
{
if(ch[i][k]==ch[j][k])
count1++;
}
}
if((count1==ch[i].length)&&(i!=j))
{                                                                         
	c=count1;
	count1=0;
break;
}
}
if((count1!=ch[i].length)&&(c==0)&&(d==i))
{
str[l]=new String(ch[i]);
l++;
count1=0;
}
else if(c==ch[i].length)
{
counts[l]++;
c=0;
}
}
return str;
}
}