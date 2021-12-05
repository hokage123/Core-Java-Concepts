//vargs
class Anki456
{
static void show(Object... x)//sabse flexible function kitne bhi arg koi bhi arg pass
{
for(int i=0;i<x.length;i++)
System.out.println(x[i]+"");
}
public static void main(String... g)
{
int day=1;
String month="april";
int year=2014;
show();//new Object[]{}
show(day);//new Object[]{new Integer(day)}//primitive values wrapper classes ke form me pass
show(day,month);//new Object{new Integer(day),month}
show(day,month,year);//new Object{new Integer(day),month,new Integer(year)}
Object dateinfo[]={day,month,year};
show(dateinfo);//dateinfo wali array pass 
show(new Object[]{dateinfo});//ye bhi refid pass
}
}