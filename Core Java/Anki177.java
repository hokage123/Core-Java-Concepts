import java.util.Scanner;
class Anki177
{
public static void main(String... s)
{
	int a[]={5,6,7},b[];
	b=new int[]{10,20,30};
	for(int i=0;i<a.length;i++)
	a[i]=i+3;
	for(int j=0;j<a.length;j++)
		System.out.println(a[j]);
	for(int k:a)
		System.out.println(k);
	for(int j=0;j<b.length;j++)
		System.out.println(b[j]);
	for(int k:b)
		System.out.println(k);

	System.out.println(a.length);
System.out.println(a.getClass().getName());
}

}