//Arrays of generic class Array ref var ka ref ka nahi
class Gen<T extends Number>
{
T ob;
T vals[];
Gen(T o,T[] nums)
{
ob=o;
vals=nums;
}
}
class Anki476
{
public static void main (String... s)
{
Integer n[]={1,2,3,4,5};
Gen<Integer> iOb=new Gen<>(50,n);
//we can't create array of specific generic refs
//Gen<Integer> gen[]=new Gen<Integer>[10];
//wrong
Gen<?> gens[]=new Gen<?>[2];//correct ? operator generic ref vars ka array jinke datatypes obj banate time set
gens[0]=new Gen<Integer>(10,n);
System.out.println(gens[0].ob);
gens[1]=new Gen<Float>(2.3f,new Float[]{1.2f,2.3f});
for(int i=0;i<gens.length;i++)
for(int j=0;j<gens[i].vals.length;j++)
System.out.println(gens[i].vals[j]);
}
}