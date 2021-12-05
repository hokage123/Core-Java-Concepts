//MyHashSetCopy
import java.util.HashSet;
class Anki602
{
public static void main(String... s)
{
HashSet<String> hs=new HashSet<>();
//add elements to hashSet
hs.add("first");
hs.add("second");
hs.add("third");
System.out.println(hs);
HashSet<String> subSet=new HashSet<>();
subSet.add("S1");
subSet.add("S2");
hs.addAll(subSet);//addAll() me jisko pass uske saare element jis set se chalaya usme add  
System.out.println("hashSet content adding another collection");
System.out.println(hs);
}
}