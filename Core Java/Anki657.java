//ek aur class YearMonth kaa combo dono par  operation perform
//YearMonth
import java.time.Month;
import java.time.YearMonth;
class Anki657
{
public static void main(String... i)
{
YearMonth ym1=YearMonth.of(2016,Month.AUGUST);//YearMonth ka static method of() me year aur month pass toh YearMonth  ka combo represent krne waala obj 
int monthLen=ym1.lengthOfMonth();//lengthOfMonth() month waale part ka length nikaal kr dega 
System.out.println(monthLen);
int yearLen=ym1.lengthOfYear();//lengthOfYear() year waale part ka length nikaal kr dega
System.out.println(yearLen);
}
}