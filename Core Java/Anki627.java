//MyListDisjoint
//Collections ke disjoint() me two list pass agar dono me ek bhi element common toh false return nahi toh true
import java.util.*;
class Anki627
{
public static void main(String... s)
{
List<String> sl=new ArrayList<>();
sl.add("apple");
sl.add("java");
sl.add("c++");
sl.add("unix");
sl.add("orange");
sl.add("airtel");
List<String> t1=new ArrayList<>();
t1.add("job");
t1.add("oracle");
t1.add("jungle");
t1.add("cricket");
boolean isCommon=Collections.disjoint(sl,t1);
System.out.println("Does not found any common elements?"+isCommon);
t1.add(new String("java"));
isCommon=Collections.disjoint(sl,t1);
System.out.println("Does not found any common elements?"+isCommon);
}
}