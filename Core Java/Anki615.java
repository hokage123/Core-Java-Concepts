//copy() se first list jo pass usme second list ke saare content aa jaate hai replace hokar jita second list ka length utne tak
//CopyArrayList
import java.util.ArrayList;
import java.util.Collections;
class Anki615
{
public static void main(String... d)
{
ArrayList<String> arrayList1=new ArrayList<>();
arrayList1.add("1");
arrayList1.add("2");
arrayList1.add("3");
ArrayList<String> arrayList2=new ArrayList<>();
arrayList2.add("one");
arrayList2.add("two");
arrayList2.add("three");
arrayList2.add("four");
arrayList2.add("five");
System.out.println(arrayList2);
Collections.copy(arrayList2,arrayList1);
System.out.println(arrayList2);
}
}