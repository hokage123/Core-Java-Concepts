//EnsureCapacityExample
import java.util.*;
class Anki527
{
public static void main(String... s)
{
//ArrayList with capacity 4
//ArrayList<String> al=new ArrayList<>(4);
Vector<String> al=new Vector<>(4);
System.out.println(al.capacity());
//added 4 elements
al.add("Hi");
al.add("Hello"); 
al.add("Bye");
al.add("GM");
//increase capacity to 5
al.ensureCapacity(10);//ensureCapacity() se seeda jitna pass utne ka array ArrayList par bhi chal jata hai par capacity show nahi krta
System.out.println(al.capacity());
System.out.println(al);
al.add("GE");
al.add("GE");
al.add("GE");
for(String temp:al)
System.out.println(temp);
}
}