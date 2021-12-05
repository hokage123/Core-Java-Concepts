//MyDateFormatter
//SimpleDateFormat me date do tarike se nikaal skte ho
import java.text.SimpleDateFormat;
import java.util.Date;
class Anki655
{
public static void main(String... s)
{
SimpleDateFormat sdf=new SimpleDateFormat("yyyy:MM:dd G 'at' HH:mm:ss z");//y se year year four digit four y M se month wo two digit me d se day wo bhi two digit me G se era H se time ka hour waala part yeh bhi two digit me m se time ka minutes waala part yeh bhi two digit me s se time ka seconds waala part yeh bhi two digit me z se time zone
System.out.println("yyyy:MM:dd G'at' HH:mm:ss z --->"+sdf.format(new Date()));
sdf=new SimpleDateFormat("hh 'o' 'clock' a, zzzz");//h se o clock waala hour waala format two digits me a se Am ya Pm z se time zone
System.out.println("hh 'o' 'clock' a,zzzz --->"+sdf.format(new Date()));
//sdf ke jis format waale obj par format() chalakar Date  class ka obj pass ussi format me date aa jayega
}
}