//MyElementCheck
import java.util.ArrayList;
import java.util.List;
class Anki534
{
public static void main(String... s)
{
ArrayList<String> arrl=new ArrayList<>();
arrl.add("First");
arrl.add("Second");
arrl.add("Third");
arrl.add("Random");
List<String> list=new ArrayList<String>();
list.add("Second");
list.add("Random");
System.out.println("Does the ArrayList contains all list elements?"+arrl.containsAll(list));
list.add("one");
System.out.println("Does the ArrayList contains all list elements?"+arrl.containsAll(list));
}
}
//containsAll()check krta hai jis collection se chalaya usme saare elements us collection ke hai yaa nahi jise pass