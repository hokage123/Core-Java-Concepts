class Gen<T>
{
T ob;
Gen(T o)
{
ob=o;
}
//Return ob;
T getOb()
{
return ob;
}
}
//a subclass of Gen
class Gen2<T> extends Gen<T>
{
Gen2(T o)
{
super(o);
}
}
//Demonstrate the runtime Type id implication
//of generic class hierachy
class Anki480
{
public static void main(String... s)
{
//create the GenObj for Integer
Gen<Integer> iob=new Gen<Integer>(65);
//create a Gen2 obj for Integer
Gen2<Integer> iob2=new Gen2<Integer>(68);
//create a Gen2 obj for Strings
Gen2<String> strob2=new Gen2<>("Generics");
if(iob2 instanceof Gen2<?>)
System.out.println("iob2 is instance of Gen2");
if(iob2 instanceof Gen<?>)
System.out.println("iob2 is instance of Gen");
if(strob2 instanceof Gen2<?>)
System.out.println("strob2 is instance of Gen2");
if(strob2 instanceof Gen<?>)
System.out.println("strob2 is instance of Gen2");
System.out.println();
//see if iob is an instance of which its not
if(iob instanceof Gen2<?>)//child ka ref parent ka Par parent ka child ka nahi
System.out.println("iob is instance of Gen2");
//see if iob is instance of Gen which it is
if(iob instanceof Gen<?>)
System.out.println("iob is instance of Gen");
}
}