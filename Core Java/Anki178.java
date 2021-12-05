class Anki178
{
	int x[];
Anki178(int z)
{
x=new int[z];
System.out.println(x.length);
for(int i=0;i<x.length;i++)
	x[i]=i+3;
	for(int j=0;j<x.length;j++)
		System.out.println(x[j]);
	for(int k:x)
		System.out.println(k);

}
public static void main(String... s)
{
Anki178 f=new Anki178(10);
/*for(int i=0;i<x.length;i++)
	x[i]=i+3;
	for(int j=0;j<x.length;j++)
		System.out.println(x[j]);
	for(int k:x)
		System.out.println(k);*/

Anki178 j=new Anki178(20);
/*for(int i=0;i<x.length;i++)
	x[i]=i+3;
	for(int j=0;j<x.length;j++)
		System.out.println(x[j]);
	for(int k:x)
		System.out.println(k);*/

}
}