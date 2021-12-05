//MyListRotate
//Collections ka rotate() list aur index pass us list ko us index ke about rotate pichle waale index aage waale index piche circular otate nahi
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Anki623
{
public static void main(String... s)
{
List<String> list=new ArrayList<>();
list.add("java");
list.add("c");
list.add("c++");
list.add("unix");
list.add("perl");
list.add("php");
list.add("javascript");
list.add("ruby");
list.add(".net");
System.out.println(list);
Collections.rotate(list,5);
System.out.println("list after rotation");
System.out.println(list);
}
}