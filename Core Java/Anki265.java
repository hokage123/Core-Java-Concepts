//public boolean endsWith(String Suffix)
class Anki265
{
public static void main(String... s)
{
String Str=new String("This is really not immutable!!");
boolean retVal;
retVal=Str.endsWith("immutable!!");
System.out.println("Returned Value="+retVal);
retVal=Str.endsWith("immut");
System.out.println("Returned Value="+retVal);
}
}