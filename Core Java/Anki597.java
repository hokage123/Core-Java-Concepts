//Set
//HashSetDemo
//HashSet HashMap ka andar se obj banata hai  asli me Set kaa obj Map ke key ke tarah add with dummy obj as val
import java.util.*;
class Anki597
{
public static void main(String... s)
{
HashSet<String> al=new HashSet<>();
System.out.println(al.size());
al.add("a");
al.add("b");
al.add("c");
System.out.println(al.add("c"));
System.out.println(al.size());
System.out.println(al);
}
}