//Lamda with Collection
import java.util.*;
class Anki501
{
public static void main(String... d)
{
String[] str={"lalu","rabari","meesa","nitish"};
List<String> family=Arrays.asList(str);//Arrays class se obj nikalkar List ke form me obj
//old looping
for(String s:family)
{
System.out.println(s+";");
}
//using lambdaExpression and functional operation
family.forEach((s->System.out.println(s+";")));
System.out.println("");
//using double colon operation in from java8
family.forEach(System.out::println);//:: operator ek ek var nikal nikal kr print
}
}