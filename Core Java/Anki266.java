class Anki266
{
public static void main(String... s)
{
String Str1=new String("This is really not immutable");
String Str2=Str1;
String Str3=new String("This is really not immutable");
String Str4=new String("This IS REALLY not Immutable");
boolean retVal;
retVal=Str1.equals(Str2);
System.out.println("Returned val of"+retVal);
retVal=Str1.equals(Str3);
System.out.println("Returned val of"+retVal);
retVal=Str1.equalsIgnoreCase(Str4);
System.out.println("Returned val of"+retVal);
}
}