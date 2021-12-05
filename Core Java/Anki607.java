//MySetSubList
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
class Anki607
{
public static void main(String... s)
{
TreeSet<String> ts=new TreeSet<>();
ts.add("RED");
ts.add("ORANGE");
ts.add("BLUE");
ts.add("GREEN");
ts.add("WHITE");
ts.add("BROWN");
ts.add("YELLOW");
ts.add("BLACK");
System.out.println(ts);
Set<String> subSet=ts.subSet("GREEN","WHITE");//subSet() subMap() jaisa upperbound include nahi lowerbound and dono bound ke bich ka include sorted order me se
System.out.println("subSet:"+subSet);
subSet=ts.subSet("GREEN",true,"WHITE",true);//es subSet() me dono true upperbound lowerbound include 
System.out.println("subSet:"+subSet);
subSet=ts.subSet("GREEN",false,"WHITE",true);//es subSet() me upperbound ke aage ka boolean var true toh sirf voh include
System.out.println("subSet:"+subSet);
subSet=ts.tailSet("GREEN");//tailSet() tailMap() jaisa saare bade vale aur barabar include sorted order me se
System.out.println("subSet"+subSet);
subSet=ts.headSet("WHITE");//headSet() headMap() jaisa strictly saare chote vale sorted order me se
System.out.println("subSet"+subSet);

}
}