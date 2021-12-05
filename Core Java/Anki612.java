//ArrayListBinarySearch
//kisi bhi element ko array me binarySearch kne ki minimum requirement woh array sorted hona chahiye
import java.util.ArrayList;
import java.util.Collections;
class Anki612
{
public static void main(String... s)
{
ArrayList<String> arrayList=new ArrayList<>();
arrayList.add("1");
arrayList.add("1");
arrayList.add("2");
arrayList.add("5");
arrayList.add("2");
Collections.sort(arrayList);
System.out.println("sorted arrayList contains"+arrayList);
int index=Collections.binarySearch(arrayList,"2");//binarySearch() me arrayList aur element pass woh arrayList me jis index par mila woh return 
System.out.println("element found at"+index);
}
}