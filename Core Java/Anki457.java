//vargs
class Anki457
{
void show(int... x)
{
for(int i=0;i<x.length;i++)
System.out.println(x[i]);
for(int i:x)
System.out.println(i);
}
void show(int z)
{
System.out.println("Single"+z);
}
public static void main(String... s)
{
new Anki457().show(10,20,30,40);
System.out.println("after second call");
new Anki457().show(20);//goes to the exact match
}
}