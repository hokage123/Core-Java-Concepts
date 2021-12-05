//YearDemo
//Year class se kisi year par operation perform
import java.time.Year;
class Anki658
{
public static void main(String... s)
{
Year y1=Year.of(2016);//Year ke non-static method of() me jo year pass usko represent krne waala obj
System.out.println(y1);
Year y2=y1.minusYears(2);//Year ke non-static method minusYears() me jo pass utne minus krne par jo year obj use represent
System.out.println(y2);
Year y3=y1.plusYears(3);//Year ke non-static method plusYears() me jo pass utne plus krne par jo year obj use represent
System.out.println(y3);
Year y4=Year.now();//Year ka static method now() se es year jo chal raha hai usse represent krne waala Year class kaa obj
System.out.println(y4);
if(y1.isLeap())//Year kaa non static method isLeap() agar true return toh woh leap year
System.out.println(y1+"is a leap year");
else
System.out.println(y1+"is not a leap year");
}
}