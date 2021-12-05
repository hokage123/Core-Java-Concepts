//TrimExample
import java.util.*;
class Anki539
{
public static void main(String... s)
{
//ArrayList<Integer> arrayList=new ArrayList<>(50);
Vector<Integer> arrayList=new Vector<>(50);
System.out.println(arrayList.capacity());
arrayList.add(1);
arrayList.add(2);
arrayList.add(3);
arrayList.add(4);
arrayList.add(5);
arrayList.add(6);
arrayList.trimToSize();//trimToSize() capacity choti krke size ke barabar kr degi
System.out.println(arrayList.capacity());//ArrayList me capacity() naam ka koi method nahi jisse uski capacity nikal sake
System.out.println(arrayList);
}
}