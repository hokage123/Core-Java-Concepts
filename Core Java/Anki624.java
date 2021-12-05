//MyListReplaceAll
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Anki624
{
public static void main(String... s)
{
List<String> list=new ArrayList<>();
list.add("java");
list.add("c");
list.add("c++");
list.add("unix");
list.add("perl");
list.add("php");
list.add("javascript");
list.add("perl");
list.add("ruby");
list.add(".net");
list.add("perl");
list.add("c++");
System.out.println(list);
//replace all perl with dumdum
Collections.replaceAll(list,"perl","dum-dum");//replaceAll() me list pass two obj pass saare first obj second obj se replace
System.out.println(list);
}
}