enum Week
{
Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}
class Anki495
{
public static void main(String... s)
{
//obtain all ordinal values using ordinal
System.out.println("Here are all week constant and their ordinal values");
Week day1[]=Week.values();
for(int i=0;i<day1.length;i++)
{
System.out.println(day1[i]+"=");
System.out.println(day1[i].ordinal());
}
for(Week day:Week.values())
System.out.println(day+" "+day.ordinal());
}
}