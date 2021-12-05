enum Week
{
Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}
class Anki497
{
public static void main(String... s)
{
Week day1,day2,day3;
day1=Week.Monday;
day2=Week.Tuesday;
day3=Week.Monday;
if(day1.equals(day2))
System.out.println("Error");
if(!day1.equals(day3))
System.out.println(day1+"not equals"+day3);
if(day2!=day3)
System.out.println(day2+"!="+day3);
}}