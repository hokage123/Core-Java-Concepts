//relationship of generic class
//when a generic class inherits non-generic class its like normal inheritance
class NonGen
{
int num;
NonGen(int i)
{
num=i;
}
int getnum()
{
return num;
}
}
class Gen<T> extends NonGen
{
T ob;//declare an obj of Type T
//pass the constructor a reference
//to a obj of Type T
T getOb()
{
return ob;
}
Gen(T o,int i)
{
super(i);
ob=o;
}
}
//create a gen obj
class Anki479
{
public static void main(String... s)
{
//create a Gen obj for String
Gen<String> w=new Gen<>("Hello",47);
System.out.println(w.getOb()+"");
System.out.println(w.getnum());
}
}