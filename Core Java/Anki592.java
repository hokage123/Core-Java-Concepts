//NavigableMapHigherEntry
import java.util.*;
class Anki592
{
public static void main(String... o)
{
NavigableMap original=new TreeMap();
original.put("1","1");
original.put("2","2");
original.put("3","3");
System.out.println(original);
//higherEntry will be("3","3")
Map.Entry higherEntry=original.higherEntry("2");//higherEntry() me jo key pass usse turant badi key ki Entry nikaal kr dega
System.out.println(higherEntry);
//lowerEntry will be("1","1")
Map.Entry lowerEntry=original.lowerEntry("2");//lowerEntry() me jo key pass usse turant choti key ki Entry nikaal kr dega
System.out.println(lowerEntry);
}
}