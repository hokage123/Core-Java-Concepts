//Overriding  methods in generic classes
class Gen<T>
{
T ob;//declare an obj of type t
Gen(T o)
{
ob=o; 
}
//return ob
T getOb()
{
System.out.println("Gen's getOb():");
return ob;
}
}
class Gen2<T> extends Gen<T>
{
Gen2(T o)
{
super(o);
}
//override getOb()
T getOb()
{
System.out.println("Gen2's getOb():");
return ob;
}
}
//demonstrate generic method override
class Anki481
{
public static void main(String... s)
{
//create a Gen obj for Integer
Gen<Integer> iob=new Gen<Integer>(88);
//create a Gen2 obj for String
Gen2<String> strob2=new Gen2<String>("Generic Test");
System.out.println(iob.getOb());
System.out.println(strob2.getOb());
}
}