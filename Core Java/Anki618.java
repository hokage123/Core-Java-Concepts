//ReverseDemo
import java.util.*;
class Anki618
{
public static void main(String... s)
{
LinkedList<Integer> ll=new LinkedList<>();
ll.add(-8);
ll.add(20);
ll.add(-20);
ll.add(8);
System.out.println(ll);
Comparator<Integer> r=Collections.reverseOrder();//Collections ka reverseOrder() method se Comparator ko implement krne waali class ka ref jo ulte order me sort krke de deta hai sort() me list aur iska ref pass krne par  
Collections.sort(ll,r);
for(int i:ll)
System.out.println(i+"");
Collections.shuffle(ll);
System.out.println(""+ll);
for(int i:ll)
System.out.println(i+"");
System.out.println("maximum"+Collections.max(ll));
System.out.println("minimum"+Collections.min(ll));
}
}