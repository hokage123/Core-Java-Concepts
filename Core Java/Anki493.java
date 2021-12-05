enum Week
{
Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}
class Anki493
{
public static void main(String... d)
{
System.out.println("Here are all week constants");
//use value
Week allWeek[]=Week.values();
for(Week aday:allWeek)
{
System.out.println(aday);
}
for(int i=0;i<allWeek.length;i++)
{
System.out.println(allWeek[i]);
}
}
}