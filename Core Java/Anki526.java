//CompareArrayList
import java.util.ArrayList;
class Anki526
{
public static void main(String... d)
{
ArrayList<String> al1=new ArrayList<String>();
al1.add("hi");
al1.add("how are you");
al1.add("good morning");
al1.add("bye");
al1.add("good night");
ArrayList<String> al2=new ArrayList<>();
al2.add("bye");
al2.add("good night");
al2.add("maa chudao");
al2.add("sabse bada madharchod");
//storing comparison output in ArrayList<String>
ArrayList<String> al3=new ArrayList<>();
for(String temp:al1)
al3.add(al2.contains(temp)?"Yes":"No");
System.out.println(al3);
//storing comparison output in ArrayList<Integer>
ArrayList<Integer> al4=new ArrayList<>();
for(String temp2:al1)
al4.add(al2.contains(temp2)?1:0);
System.out.println(al4);
}
}
//contains andar se object class ka equals method ek ek krke elements par chalakar check
//jis class me equals() override nahi usme bade papa ka equals() refid wala prb ho jayege 