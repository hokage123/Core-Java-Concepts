//Colections me pehle ek type ke obj daalne hote the toh uske liye checkedList() checkedMap() checkedCollection() checkedSet()
//MyCheckedCollection
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
class Anki632
{
public static void main(String... s)
{
List myList=new ArrayList();
myList.add("one");
myList.add("two");
myList.add("three");
myList.add("four");
myList.add(10);
Collection chkList=Collections.checkedCollection(myList,String.class);
System.out.println("checkedList content"+chkList);
//you can add any type of element to myList
myList.add(10);
//you cannot add any type of elements to chkListObject doing so throws ClassCastException
//chkList.add(10);
chkList.add("10");
System.out.println("checked List content"+chkList);
System.out.println("my List content"+myList);
}
}
//List chkList= Collections.checkedList(myList,String.class)
//Map chkMap=Collections.checkedMap(myMap,String.class,Integer.class)
//Set chkSet=Collections.checkedSet(mySet)