//SetExample
//set(int index,int value) method se us index par jaakar val apni val se value replace
import java.util.ArrayList;
class Anki537
{
public static void main(String... s)
{
ArrayList<Integer> arrayList=new ArrayList<>();
arrayList.add(1);
arrayList.add(2);
arrayList.add(3);
arrayList.add(4);
System.out.println("ArrayList before update"+arrayList);
arrayList.set(0,11);
arrayList.set(1,22);
arrayList.set(2,33);
arrayList.set(3,44);
System.out.println("ArrayList after update"+arrayList);
}
}