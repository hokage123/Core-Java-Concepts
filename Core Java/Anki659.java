//WithMethod
//LocalDate se kisi bhi date par operation perform
import java.time.LocalDate;
import java.time.Month;
class Anki659
{
public static void main(String... s)
{
LocalDate localDate1=LocalDate.of(2017,Month.SEPTEMBER,4);//localDate bhi date ko represent static method of() me year month ka static const and day pass krne par date ko represent
System.out.println(localDate1);
LocalDate localDate2=localDate1.withYear(2018);//jis LocalDate ke obj par withYear() chalakar arg jo pass usi year ko same LocalDate class ke obj me change krke return
System.out.println(localDate2);
LocalDate localDate3=localDate1.withYear(2014).withMonth(7);//jis LocalDate ke obj par withMonth() chalakar arg jo pass usi month ko same LocalDate class ke obj me change krke return
System.out.println(localDate3);
}
}