//add() method example
import java.util.ArrayList;
class Anki521
{
public static void main(String... s)
{
ArrayList<String> al=new ArrayList<>();
al.add("Hi");
al.add("hello");
al.add("String");
al.add("Test");
al.add(3,"lalu");//add() method overload hai List me jo index pass vahan par jaakar add otherwise aise add() method collection ke last me add
System.out.println("element after adding Howdy"+al);
al.add(0,"Bye");
System.out.println("elements after adding Bye"+al);
}
} 