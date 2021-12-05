//CurrentDate
import java.util.*;
class Anki651
{
public static void main(String... d)
{
Date today=new Date();
//Date today=new Date("05/12/2014 18:30:45");//Apna date bhi bhej skte hai constructor me two format hai
//Date today=new Date(5,12,2014,18,30,45);
GregorianCalendar cal=new GregorianCalendar();
cal.setTime(today);//calendar ka setTime() kro usi date kaa date pass krke calendar me date set
System.out.println("Today:"+today.toString());
displayDateInfo(cal);
cal.clear();//calendar me se date clear
}
static void displayDateInfo(GregorianCalendar cal)
{
String days[]={"","Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
String am_pm[]={"AM","PM"};
System.out.println("year:"+cal.get(Calendar.YEAR));//get() function me Calendar.YEAR  Calendar ka static const bhejne se year nikaal kr dega
System.out.println("Month:"+days[cal.get(Calendar.DAY_OF_WEEK)]);//get() function me Calendar.DAY_OF_WEEK Calendar ka static const bhejne se  day nikaal kr dega
System.out.println("Hour:"+cal.get(Calendar.HOUR));//get() function me Calendar.HOUR Calendar ka static const bhejne se  time ka hour vaala part nikaal kr dega
System.out.println("Minute:"+cal.get(Calendar.MINUTE));//get() function me Calendar.MINUTE Calendar ka static const bhejne se  time ka minute vaala part nikaal kr dega
System.out.println("Second:"+cal.get(Calendar.SECOND));//get() function me Calendar.SECOND Calendar ka static const bhejne se  time ka second vaala part nikaal kr dega
System.out.println(am_pm[cal.get(Calendar.AM_PM)]);//get() function me Calendar.AM_PM Calendar ka static const bhejne se  time ka am pm vaala part nikaal kr dega

TimeZone tz=cal.getTimeZone();//getTimeZone() se kis zone me hai woh nikaal kr dega use liye TimeZone class
System.out.println("TimeZone:"+tz.getID());
}
}