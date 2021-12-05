//NavigableMapHigherKey
import java.util.*;
class Anki593
{
public static void main(String... o)
{
NavigableMap original=new TreeMap();
original.put("1","1");
original.put("2","2");
original.put("3","3");
System.out.println(original);
//higherKey will be"3"
String higherKey=(String)original.higherKey("2");//higherKey() me jo key pass usse turant badi key  nikaal kr dega
System.out.println(higherKey);
//lowerKey will be "1"
String lowerKey=(String)original.lowerKey("2");//lowerKey() me jo key pass usse turant choti key nikaal kr dega
System.out.println(lowerKey);
}
}