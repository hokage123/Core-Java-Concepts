//enum ne compareTo() override kiya
enum Week
{
Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}
class Anki496
{
public static void main(String... s)
{
Week day1,day2,day3;
day1=Week.Monday;
day2=Week.Tuesday;
day3=Week.Friday;
if(day1.compareTo(day2)<0)
System.out.println(day1+"comes before"+day2);
if(day2.compareTo(day3)>0)
System.out.println(day2+"comes after"+day3);
if(day2.compareTo(day3)==0)
System.out.println(day2+"equals"+day3);
}
}