//subSort
import java.util.Arrays;
class Anki648
{
public static void main(String... s)
{
int[] array={2,5,-2,6,-3,8,0,-7,-9,4};
for(int i:array)
System.out.println("");
Arrays.sort(array,3,7);//sort() me array upperbound lowerbound pass toh unke bich ke element lowerbound include upperbound include nahi
for(int i:array)
System.out.println(i);
}
}