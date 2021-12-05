//MyDistElementEx
//agar apne class ke obj me do vars hai toh dono ko consideration me rkhe equals() hashCode() ko override kre agar apne class ke obj ko HashSet ke element ke tarah add krna chahate hai toh
import java.util.HashSet;
class Anki601
{
public static void main(String... s)
{
HashSet<Price> lhm=new HashSet<>();
lhm.add(new Price("Banana",20));
lhm.add(new Price("Apple",40));
lhm.add(new Price("Orange",30));
for(Price pr:lhm)
System.out.println(pr);
Price key=new Price("Banana",20);
System.out.println("Does set contains key?"+lhm.contains(key));
System.out.println("inserting duplicate object...");
lhm.add(key);
System.out.println("deleting key from set...");
lhm.remove(key);
System.out.println("After insertion");
for(Price pr:lhm)
System.out.println(pr);
}
}
class Price
{
private String item;
private int price;
public Price(String item,int pr)
{
this.item=item;
this.price=pr;
}
public int hashCode()
{
System.out.println("\nhashCode");
int hashCode=0;
hashCode=price*20;
hashCode+=item.hashCode();
return hashCode;
}
public boolean equals(Object obj)
{
System.out.println("\nequals");
if(obj instanceof Price)
{
Price pp=(Price)obj;
return(pp.item.equals(this.item)&&pp.price==this.price);
}
else
{
return false;
}
}
public String toString()
{
return "item"+item+"price:"+price;
}
}