class Anki228
{
public static void main(String... s)
{
Anki228 g=new Anki228();
int z=g.show();
System.out.println(z);//z=80 catch will put try kaa return finally ka Return se value overwrite tab Return
}
int show()
{
try//sirf ek case me finally ka return nahi jab Sys.exit() chala tab prog hi terminate ho gaya
{
System.exit(0);
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