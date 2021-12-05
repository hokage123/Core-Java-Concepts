//Collections ke addAll() se element bhi add kr skte hai list bhi array bhi 
//CollectionsAddAll
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Anki614
{
public static void main(String... s)
{
List<String> myList=new ArrayList<>();
myList.add("java");
myList.add("c");
myList.add("c++");
System.out.println("initial list"+myList);
Collections.addAll(myList,"perl","php");
System.out.println("After adding elements"+myList);
String[] strArr={".Net","Unix"};
Collections.addAll(myList,strArr);
System.out.println("After adding List"+myList);
}
}