//MyArrayListShuffle
import java.util.ArrayList;
import java.util.Collections;
class Anki533
{
public static void main(String... s)
{
ArrayList<String> list=new ArrayList<String>();
list.add("list");
list.add("cric");
list.add("play");
System.out.println("results before shuffle operation");
for(String str:list)
System.out.println(str);
Collections.shuffle(list);//Collections ke shuffle() method se random shuffle dice ke tarah
System.out.println("result after shuffle operation");
for(String str:list)
System.out.println(str);
Collections.shuffle(list);
System.out.println("result after shuffle operation");
for(String str:list)
System.out.println(str);
}
}