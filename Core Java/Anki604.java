//MyHashSetToArray
import java.util.HashSet;
class Anki604
{
public  static void main(String... s)
{
HashSet<String> hs=new HashSet<>();
//add elements to HashSet 
hs.add("first");
hs.add("second");
hs.add("third");
System.out.println("HashSet content:");
System.out.println(hs);
String[] strArr=new String[hs.size()];
hs.toArray(strArr);//toArray() vahi purana vala
System.out.println("copied array content");
for(String str:strArr)
System.out.println(str);
}
}