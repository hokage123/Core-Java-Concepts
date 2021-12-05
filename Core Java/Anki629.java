//MyEnumerationToList
//agar ek Collection se dusre Collection me convert krna hai toh yaa toh Enumeration ka hasMoreElement() nextElement() use krke ek ek bhejo yaa toh Collections ke list me seeda Enumeration kaa obj bhej do
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
class Anki629
{
public static void main(String... s)
{
Vector<String> vct=new Vector<>();
vct.add("one");
vct.add("two");
vct.add("three");
vct.add("four");
vct.add("five");
Enumeration<String> enm=vct.elements();
List<String> ll=Collections.list(enm);
System.out.println("List element"+ll);
}
}