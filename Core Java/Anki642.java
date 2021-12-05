//ConvertList
//Arrays ke asList() me array ko pass List banakar return same element ke
import java.util.Arrays;
import java.util.List;
class Anki642
{
public static void main(String... s)
{
String[] cars={"Honda","Bmw","verna","ford"};
List<String> carList=Arrays.asList(cars);
for(String car:carList)
System.out.println(car);
}
}