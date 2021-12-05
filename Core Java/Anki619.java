//MySyncListMapSet
//Collections ke hi synchronizedList() synchronizedMap() synchronizedSet() bhi
import java.util.*;
import java.util.Collections;
import java.util.List;
class Anki619
{
public static void main(String... j)
{ 
List<String> li=new ArrayList<String>();
List<String> sysLi=Collections.synchronizedList(li);
System.out.println("synchronized List got created");
Map<String,String> mp=new HashMap<>();
Map<String,String> sysMapt=Collections.synchronizedMap(mp);
System.out.println("Synchronized map got created");
Set<String> ss=new HashSet<>();
Set<String> sysSet=Collections.synchronizedSet(ss);
System.out.println("Synchronized set got created");
}
}