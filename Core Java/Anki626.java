//MyListFill
//Collections ke fill() me list pass aur obj pass puri list usi obj se fill
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Anki626
{
public static void main(String... s)
{
List<String> ll=new ArrayList<>();
ll.add("one");
ll.add("two");
ll.add("three");
ll.add("four");
System.out.println("original list:"+ll);
Collections.fill(ll,"Temp_String");
System.out.println("After fill:"+ll);
}
}