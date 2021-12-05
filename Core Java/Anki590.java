//NavigableMapfloorKey
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
class Anki590
{
public static void main(String... f)
{
Calendar now=Calendar.getInstance();
Locale locale=Locale.getDefault();
Map<String,Integer> names=now.getDisplayNames(Calendar.DAY_OF_WEEK,Calendar.LONG,locale);
System.out.println(names);
NavigableMap<String,Integer> nav=new TreeMap<>(names);
System.out.printf("whole list %n %s %n", names);
System.out.printf("keys floor before sunday %s %n", nav.floorKey("Sunday"));//floorKey() me agar jo key as arg pass hai toh wahi nahi tohi toh choti wali
}
}