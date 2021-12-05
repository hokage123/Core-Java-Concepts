//MyHashSetRetain
import java.util.HashSet;
class Anki603
{
public static void main(String... s)
{
HashSet<String> hs=new HashSet<>();
//add elements to HashSet
hs.add("first");
hs.add("second");
hs.add("third");
hs.add("apple");
hs.add("rat");
System.out.println(hs);
HashSet<String> subSet=new HashSet<>();
subSet.add("rat");
subSet.add("second");
subSet.add("first");
subSet.add("lalu");
hs.retainAll(subSet);
System.out.println("HashSet content:");
System.out.println(hs);//jisse chalaya jayega check karega usme subSet ke kaun kaun se element subSet aur hs dono me common element ko hs me rakega baaki sab delete
}
}