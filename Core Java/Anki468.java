//positive and negative infinity
class Anki468
{
public static void main(String... g)//int ke case me 0 se division par ArithmeticException par float and double ke case me +infinity and -infinity
{
Double b1=2.4/0;
System.out.println(b1);
Double b2=-2.4/0;
System.out.println(b2);
Float f1=2.6f/0;
System.out.println(f1);
Float f2=-2.6f/0;
System.out.println(f2);
}
}