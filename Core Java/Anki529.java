//MyArrayListSubRange
import java.util.ArrayList;
import java.util.List;
class Anki529
{
public static void main(String... f)
{
ArrayList<String> arrl=new ArrayList<>();
//adding elements to the thread
arrl.add("First"); 
arrl.add("Second");
arrl.add("Third");
arrl.add("Random");
arrl.add("Click");
System.out.println("Actual arrayList:"+arrl);
List<String> list=arrl.subList(2,4);//2 se 4 tak ke index ka list 4  index include nahi
System.out.println("subList"+list);
}
}