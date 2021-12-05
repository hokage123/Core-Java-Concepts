import java.util.Scanner;
class Anki556
{
public static void main(String... s)
{
Anki556 a=new Anki556();
System.out.println("enter the String");
int length=a.length(new Scanner(System.in).nextLine());
System.out.println("required length is"+length);
}
int length(String u)
{
return u.toCharArray().length;
}
}