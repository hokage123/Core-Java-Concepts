//Vargs
class Anki454
{
void show(int... x)//var length arg compilation ke baad array me convert
{
	int j;
for(int i:x)//foreach loop use proof array ka
System.out.println(i);
for(j=0;j<x.length;j++)//.length use  proof array ka
System.out.println(x[j]);
}
//void show(int v[]){}//compilation error func overloading nahi
public static void main(String[] j)
{
Anki454 o=new Anki454();
o.show(20);
o.show(10,20,98);
o.show(new int[]{10,20,78});
}
}