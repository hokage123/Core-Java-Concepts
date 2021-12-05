//method ke args generic banaye
class Anki478
{
//detemine if an obj is in array
static<T,V extends T> boolean isIn (T x,V[] y)//modifier ke  baad
{
for(int i=0;i<y.length;i++)
if(x.equals(y[i]))return true;
return false;
}
static<T extends Number> double add(T x,T y)
{
double d=x.doubleValue()+y.doubleValue();
return d;
}
public static void main(String... l)
{
//use isIn() on integers
Integer nums[]={1,2,3,4,5,6};
if(isIn(2,nums))
System.out.println("2 is in nums");
if(isIn(7,nums))
System.out.println("7 is in nums");
System.out.println();
//use isIn() on Strings
String str[]={"one","two","four","six"};
if(isIn("three",str))
System.out.println("three is in str");
if(isIn("six",str))
System.out.println("six is in str");
System.out.println(add(10,20));
System.out.println(add(10.5f,20.5f));
System.out.println(add(10.5,20.5));
System.out.println(add(100L,200L));
}
}