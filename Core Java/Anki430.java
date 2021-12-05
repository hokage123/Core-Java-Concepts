class Anki430
{
public static void main(String... s)
{
Object o=new Anki430();
Class c=o.getClass();//getClass() Object class ka method jo kisi bhi ref var par chalao too jis class ka obj hai usi class ki reflected image yaani Class class ka ref return jo usi class ko represent jis ki ref obj ke ref var me hai
System.out.println(c);//hamare class ka naam print reflected image ko represent 
}
}