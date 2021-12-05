//MyDeleteKeyObject
//Abhi bhi apne class ke obj ko as a key use krne ke liye equals() hashCode() override par dono var consider krke
import java.util.HashMap;
import java.util.Set;
class Anki575
{
public static void main(String... s)
{
HashMap<Price,String> hm=new HashMap<>();
hm.put(new Price("Banana",20),"Banana");
hm.put(new Price("Apple",40),"Apple");
hm.put(new Price("Orange",41),"Orange");
hm.put(new Price("Apple",41),"Mango");
printMap(hm);
Price key=new Price("Banana",20);
System.out.println("Does key Available?"+hm.containsKey(key));//containsKey() se jo key pass wohai toh true
System.out.println("Does value Available?"+hm.containsValue("Banana"));//containsValue() se jo value pass wohai toh true
System.out.println("Deleting key...");
hm.remove(key);
System.out.println("After Deleting key:");
printMap(hm);
}
public static void printMap(HashMap<Price,String> map)
{
Set<Price> keys=map.keySet();
for(Price p:keys)
System.out.println(p+"==>"+map.get(p));
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