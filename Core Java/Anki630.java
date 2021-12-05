//MyEmptyList
//emptyList() emptySet() emptyMap() empty List empty Set empty Map banakar dega
import java.util.Collections;
import java.util.*;
class Anki630
{
public static void main(String... o)
{
List<String> myEmptyList=Collections.<String>emptyList();
System.out.println("Empty List"+myEmptyList);
Map<String,String> myEmptyMap=Collections.<String,String>emptyMap();
System.out.println("Empty Map"+myEmptyMap);
Set<String> myEmptySet=Collections.<String>emptySet();
System.out.println("Empty Set"+myEmptySet);
}
}