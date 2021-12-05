//ToMethod
import java.time.LocalDate;
class Anki660
{
public static void main(String... g)
{
LocalDate localDate=LocalDate.of(2017,9,4);
long days=localDate.toEpochDay();//kisi LocalDate ke obj par agar toEpochDay() method chalaoge toh Epochday aur jo day pass dono me difference dikhayega
long z=(days-247)/365;
System.out.println(days);
System.out.println(z);
}
}