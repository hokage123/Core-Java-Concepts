//DateCreationWithSeconds
//System ka currentTimeMillis() se date milliseconds me nikaal kr dega
import java.util.Date;
class Anki650
{
public static void main(String... s)
{
//get current time in milliseconds
long currentTimeInSecs=System.currentTimeMillis();
Date d=new Date(currentTimeInSecs);//date ka ek constructor time millisec me lega date nikaal kr dega
System.out.println(d);
} 
}