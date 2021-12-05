//ArrayListDemo2
//toArray() method
import java.util.*;
class Anki519
{
public static void main(String... s)
{
ArrayList<Integer> al=new ArrayList<>();
int x[]={1,-1,2,-2,3,-3,4,-4};
for(int i=0;i<x.length;i++)
al.add(x[i]);//primitive se wrapper me apne aap boxing hokar add
Object o[]=al.toArray();//Collection class ke toArray() method se collection array me convert with same elements
for(int i=0;i<o.length;i++)
{
Integer z=(Integer)o[i];//element ko Integer me downcast phir use
System.out.println(z.intValue()+"  ");
}
System.out.println("");
for(Integer i:al)
System.out.println(i.intValue()+"");
}
}