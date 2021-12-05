//MySubListIndex
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Anki620
{
public static void main(String... s)
{
List<String> list=new ArrayList<String>();
list.add("unix");
list.add("perl");
list.add("php");
list.add("javascript");
list.add("ruby");
list.add(".net");
list.add("jdbc");
list.add("servlets");
list.add("php");
list.add("javascript");
list.add("ruby");
List<String> subList=new ArrayList<>();
subList.add("php");
subList.add("javascript");
subList.add("ruby");
System.out.println("index of sublist:"+Collections.indexOfSubList(list,subList));//indexOfSubList()  me two list ke obj pass agar second wala list pehle me present toh uska first index return first index se check karega subList ko 
System.out.println("last index of sublist:"+Collections.lastIndexOfSubList(list,subList));//lastIndexOfSubList()  me two list ke obj pass agar second wala list pehle me present toh uska last se check krega krke index return
}
}