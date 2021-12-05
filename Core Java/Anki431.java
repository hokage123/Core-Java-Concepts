//Agar Compiletime par class details runtime par chahiye
class Anki431
{
public static void main(String... s)
{
Class c=java.lang.Thread.class;//compiletime par diye hua class ke naam ke aage .class Class class ka vahi ref jo  given class ka reflected image hai  
System.out.println(c.getName());
}
}