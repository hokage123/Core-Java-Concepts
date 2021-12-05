//MyDateClass
import java.util.Date;
class Anki654
{
public static void main(String... s)
{
Date d=new Date();
System.out.println("Today Date is:"+d);
System.out.println("current date:"+d.getDate());//getDate() jis Date class ke obj par uska date nikaal kr dega
System.out.println("current Day:"+d.getDay());//getDay() jis Date class ke obj par uska day nikaal kr dega
System.out.println("current Year:"+d.getYear());//getYear() jis Date class ke obj par uska year nikaal kr dega
System.out.println("current Hours:"+d.getHours());//getHours() jis Date class ke obj par uska hour wala part time ka nikaal kr dega
System.out.println("current Minutes:"+d.getMinutes());//getMinutes() jis Date class ke obj par uska minutes wala part time ka nikaal kr dega
System.out.println("current Seconds:"+d.getSeconds());//getSeconds() jis Date class ke obj par uska seconds wala part time ka nikaal kr dega
}
}