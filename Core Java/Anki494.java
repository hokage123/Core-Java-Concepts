enum Week
{
Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}
class Anki494
{
public static void main(String... s)
{
Week day;
day=Week.valueOf("Monday");
System.out.println("day contains"+day);
day=Week.valueOf("Tuesday");
System.out.println("day contains"+day);
}
}