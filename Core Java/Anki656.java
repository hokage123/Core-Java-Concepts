//time package jdk8 se isse Date handling  aasan har cheez ki class month day year sabki
//Zone
import java.time.ZoneId;
import java.util.*;
class Anki656
{
public static void main(String... s)
{
Set<String> zoneIds=ZoneId.getAvailableZoneIds();//ZoneId class ka static method getAvailableZoneIds() se saare zoneIds set ke form me
TreeSet<String> ts=new TreeSet<>(zoneIds);//TreeSet ke constructor me obj pass taaki sorted ho jaaye
for(String zoneId:ts)
System.out.println(zoneId);
}
}