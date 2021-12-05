//MyArrayListArray
import java.util.ArrayList;
class Anki528
{
public static void main(String... d)
{
ArrayList<String> arrl=new ArrayList<>();
arrl.add("First");
arrl.add("Second");
arrl.add("Third");
arrl.add("Random");
System.out.println("Actual ArrayList:"+arrl);
String[] strArr=new String[arrl.size()];
arrl.toArray(strArr);//toArray() overloaded jo array pass usme us List ke saare item bhar ke de dega jisse chalaye ho
System.out.println("created array content");
for(String str:strArr)
System.out.println(str);
}
}