//newInstance
//Array ka newInstance() me type pass .class lagakar aur num of elements pass runtime par array banakar dega
import java.lang.reflect.Array;
class Anki645
{
public static void main(String... h)
{
int array[]=(int[])Array.newInstance(int.class,5);
for(int i:array)
System.out.println(i);
}
}