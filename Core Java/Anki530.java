//MyArrayListSwap
import java.util.ArrayList;
import java.util.Collections;
class Anki530
{
public static void main(String... g)
{
ArrayList<String> list=new ArrayList<String>();
list.add("java");
list.add("cric");
list.add("play");
list.add("watch");
list.add("glass");
list.add("movie");
list.add("girl");
System.out.println(list);
Collections.swap(list,2,5);//do index aur list pass jaakar un index ke given list me element swap 
System.out.println("results after swap operation");
for(String str:list)
System.out.println(str);
}
}