//WordCountHashMap
import java.util.HashMap;
import java.util.Map;
class Anki578
{
public static void main(String... o)
{
String s="I am a sexy boy I am a sexy boy too sexy boy";
String[] splitted=s.split(" ");
Map<String,Integer> map=new HashMap<>();
for(int i=0;i<splitted.length;i++)
{
	if(map.containsKey(splitted[i]))
	{
	int cont=map.get(splitted[i]);	
	map.put(splitted[i],cont+1);
	}
	else
		map.put(splitted[i],1);
}
System.out.println(map);
}
}