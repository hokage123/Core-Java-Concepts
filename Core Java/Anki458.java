//vargs
class Anki458
{
void show(int... x)
{
for(int i=0;i<x.length;i++)
System.out.println(x[i]);
for(int i:x)
System.out.println(i);
}
void show(int z,int h)
{
System.out.println("double"+z+h);
}
public static void main(String... s)
{
new Anki458().show(10,20,30,40);
System.out.println("after second call");
new Anki458().show(20,40);//goes to the exact match
}
}