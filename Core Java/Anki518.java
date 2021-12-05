//ArrayListDemo3
//Iterator ka next() method
import java.util.*;
class Anki518
{
public static void main(String... s)
{
ArrayList<Integer> al=new ArrayList<Integer>();
//ArrayList al=new ArrayList();
int x[]={1,-1,2,-2,3,-3,4,-4};
for(int i=0;i<x.length;i++)
al.add(x[i]);
System.out.println(al);
Iterator<Integer> i=al.iterator();//Collection kaa iterator() se Iterator kaa obj mila
//Iterator i=al.iterator();
while(i.hasNext())//next element tabhi true to avoid NoSuchElementException
{
Integer z=(Integer)i.next();//Iterator ke next() se ek ek krke obj nikalkar dete hai Object class ke form phir Integer me downcast agar aage koi element nahi toh NoSuchElementException
//Integer z=i.next();
if(z.intValue()<0)
i.remove();//next() ke last call se jo mila usse remove agar next() call hua hi nahi toh IllegalStateException 
}
System.out.println(al);
}
}