// MyPushPopOpr
import java.util.LinkedList;
class Anki564
{
public static void main(String... s)
{
LinkedList<String> arrl=new LinkedList<>();
arrl.add("First");
arrl.add("Second");
arrl.add("Third");
arrl.add("Random");
System.out.println(arrl);
arrl.push("push element");
System.out.println("after push operation");
System.out.println(arrl);
arrl.pop();
System.out.println("after pop operation");
System.out.println(arrl);
}
}
//LinkedList List ke saath saath Deque interface ko bhi implement isiliye push() pop() operation