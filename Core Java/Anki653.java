//MyAfterDateTest
import java.util.Date;
class Anki653
{
public static void main(String... s)
{
Date current=new Date();
//create a date one day after current date
long nextDay=System.currentTimeMillis()+1000*60*60*24;//currentTimeMillis() se current time millisec me phir usme jitne millisec add krke next day voh add 
//create date object
Date next=new Date(nextDay);//phir Date class ka ek constructor jo date millisec me lekar date class ka obj deta hai 
long prevDay=System.currentTimeMillis()-1000*60*60*24;////currentTimeMillis() se current time millisec me phir usme jitne millisec subtract krke previous day voh add 
//create date object
Date prev=new Date(prevDay);
System.out.println(prev);
System.out.println(next);
//compare both sides
if(next.after(current))//after() tab true return jab voh jis Date class ke obj se chalaya gaya hai voh jis Date class ke obj ko as arg pass uske baad aata hai
System.out.println("This day is future day");
else
System.out.println("The day is older than current day");
if(prev.before(current))//before() tab true return jab voh jis Date class ke obj se chalaya gaya hai voh jis Date class ke obj ko as arg pass uske pehle aata hai
System.out.println("The date  is older than current day");
}
}