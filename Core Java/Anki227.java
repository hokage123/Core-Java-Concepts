class Anki227
{
public static void main(String... s)
{
Anki227 g=new Anki227();
int z=g.show();
System.out.println(z);
}
int show()
{
try
{
int x=10/0;
return 40;
}
catch(ArrayIndexOutOfBoundsException e)//catch nahi chala tab bhi finally ki return finally exception ko kill kar deta hai
{

}
finally
{
return 80;
}
}
}