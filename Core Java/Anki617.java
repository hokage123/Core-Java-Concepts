//MaxArraList
//Collections ka max() max element nikaal kr deta hai min() min element nikaal kr dega ArrayList me jis class ka obj add hai us class ko Comparable ko implement compareTo() ko override krna padega
import java.util.ArrayList;
import java.util.Collections;
class Anki617
{
public static void main(String... s)
{
ArrayList<Integer> arrayList=new ArrayList<>();
arrayList.add(new Integer(3));
arrayList.add(new Integer(1));
arrayList.add(new Integer(5));
arrayList.add(new Integer(4));
arrayList.add(new Integer(9));
Object obj=Collections.max(arrayList);
System.out.println(obj);
Object obj1=Collections.min(arrayList);
System.out.println(obj1);
}
}