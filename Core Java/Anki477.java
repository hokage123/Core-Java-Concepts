//ab class Generic nahi nahi datatype generic ab local var generic
class GenCons
{
private double val;
<T extends Number>GenCons(T args)//local var ko generic banane se pehle cons ke pehle likho
{
val=args.doubleValue();
}
void showVal()
{
System.out.println("val:"+val);
}
}
class Anki477
{
public static void main(String... s)
{
//GenCons test1=new GenCons('a');
GenCons test=new GenCons(100);
GenCons test2=new GenCons(122.55f);
test.showVal();
test2.showVal();
}
}