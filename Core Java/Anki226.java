class Anki226
{
public static void main(String... s)
{
Anki226 g=new Anki226();
int z=g.show();
System.out.println(z);//z=80 catch will put try kaa return finally ka Return se value overwrite tab Return
}
int show()
{
try
{
int x=10/0;
return 40;
}
catch(ArithmeticException e)
{

}
finally
{
return 80;
}
}
}