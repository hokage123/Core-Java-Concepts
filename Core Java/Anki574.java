//ManyToOne
//ek key par bahut sare val kaise add har key par arrayList kaa obj add
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
class Anki574
{
public static void main(String... d)
{
Map<Integer,List<String>> mapToIntStrs=new HashMap<>();
add(mapToIntStrs,1,"one");
add(mapToIntStrs,1,"two");
add(mapToIntStrs,2,"four");
add(mapToIntStrs,2,"five");
add(mapToIntStrs,3,"six");
add(mapToIntStrs,3,"seven");
Set<Integer> keySet=mapToIntStrs.keySet();
for(int i:keySet)
{
List<String> strList=mapToIntStrs.get(i);
System.out.println(i);
for(String str:strList)
System.out.println(" "+str);
}
}
private static final void add(Map<Integer,List<String>> mapTo_addTo,int keynum,String value)
{
if(mapTo_addTo.containsKey(keynum))
{
mapTo_addTo.get(keynum).add(value);
}
else
{
List<String> strList=new ArrayList<>();
strList.add(value);
mapTo_addTo.put(keynum,strList);
}
}
}