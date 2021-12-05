//clonning in ArrayList
import java.util.ArrayList;
class Anki531
{
public static void main(String... s)
{
ArrayList<String> arrl=new ArrayList<>();
//adding element to the end
arrl.add("First");
arrl.add("Second");
arrl.add("Third");
arrl.add("Random");
System.out.println("Actual ArrayList"+arrl);
ArrayList<String> copy=(ArrayList<String>)arrl.clone();
System.out.println("cloned ArrayList"+copy);
if(arrl.get(0)==copy.get(0))
System.out.println("shallow");
if(arrl!=copy)
System.out.println("clone");
}
}
//ArrayList par clone() chalaya hai par andar ke obj par nahi isiliye shallow clonning deep clonning ke liye associated obj par bhi explicitly clone() chalana pdta hai
//ArrayList ka obj alag bana par andar ke obj share