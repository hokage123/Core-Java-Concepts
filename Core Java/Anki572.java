//ConvertMapTester
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;
class Anki572
{
public static void main(String... k)
{
//keys are String
//Objects are also Strings
Map<String,String> map=new HashMap<>();
fillData(map);
//convert keys to arrays
String[] strings=keysAsArray(map);//jis map ko keysAsArray() me pass uska key array ke form me return 
for(String string:strings)
System.out.println(string);
//convert KeyTolist
List<String> list=keysAsList(map);//jis map ko keysAsList() me pass uska key list ke form me return
for(String string:list)
System.out.println(string);
}
public static void fillData(Map<String,String> map)
{
map.put("Android","Mobile");
map.put("Eclipse IDE","Java");
map.put("Eclipse ERP","Java");
map.put("Git","Version Control System");
}
private static String[] keysAsArray(Map<String,String> map)
{
Set<String> s=map.keySet();//keys kaa set banaya
String str[]=new String[s.size()];
s.toArray(str);//Array me convert toArray() se
//return map.keySet().toArray(new String[map.keySet().size()]);
return str;
}
//assume the key is of type String
private static List<String> keysAsList(Map<String,String> map)
{
List<String> list=new ArrayList<>(map.keySet());//direct key kaa Set pass list me convert krke return
return list;
}
}