//NavigableSetDemo1
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
class Anki610
{
public static void main(String... s)
{
List<Integer> list=Arrays.asList(3,2,1,4,5);
NavigableSet<Integer> ns=new TreeSet<>(list);
System.out.println("Ascending Order(default):"+ns);
Iterator<Integer> descendingIterator=ns.descendingIterator();
StringBuilder sb=new StringBuilder("descending order");
while(descendingIterator.hasNext())
{
int m=descendingIterator.next();
sb.append(m+"");
}
System.out.println(sb);
int greatest=ns.lower(3);//lower() me jo pass usse turant less
System.out.println("lower of 3="+greatest);
int smallest=ns.higher(3);//higher() me jo pass usse turant more
System.out.println("higher of 3="+smallest);
}
}