//MyRemoveAllOprs
import java.util.LinkedList;
class Anki562
{
public static void main(String... s)
{
LinkedList<String> linkedlist=new LinkedList<>();
linkedlist.add("First");
linkedlist.add("second");
linkedlist.add("third");
linkedlist.add("four");
linkedlist.add("random");
linkedlist.add("five");
linkedlist.add("six");
linkedlist.add("seven");
linkedlist.add("eight");
System.out.println(linkedlist);
System.out.println("Remove:"+linkedlist.remove());//jo next() se return wo remove usse return
System.out.println(linkedlist);
System.out.println(linkedlist.remove(2));//is index par jaakar remove aur usse return
System.out.println(linkedlist);
System.out.println(linkedlist.remove("eight"));//agar ye String hai toh remove nahi toh false 
System.out.println(linkedlist.removeFirst());//removeFirst() se head hai usse remove aur usse return
System.out.println(linkedlist);
System.out.println(linkedlist.removeLast());//removeLast() se tail hai usse remove aur usse return
System.out.println(linkedlist);
System.out.println(linkedlist.removeFirstOccurrence("Eight"));//removeFirstOccurrence() se pehli iske barabar ki string ko remove and true return agar koi iske equal ki string nahi toh false
System.out.println(linkedlist);
System.out.println(linkedlist.removeLastOccurrence("Eight"));//removeLastOccurrence()se aakriiske barabar ki string ko remove and true return agar koi iske equal ki string nahi toh false
} 
}