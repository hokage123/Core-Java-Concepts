//MyArrayListDemo
import java.util.*;
class Anki543
{
public static void main(String... s)
{
MyArrayList<String> al=new MyArrayList(5);
//MyArrayList al=new ArrayList();
Iterator i=al.iterator();
al.add("Ram");
al.add("Mohan");
al.add("Sohan");
al.add("Sita");
al.add("Gita");
i.remove();
al.add("reeta");
al.add("reeta");
al.add("reeta");
i.remove();
System.out.println(al.size1());
System.out.println(al.capacity());
System.out.println(al);
i.remove();
while(i.hasNext())
System.out.println(i.next());
System.out.println(al.size1());
System.out.println(al.capacity());
ArrayList<String> ak=new ArrayList<>();
ak.add("s");
ak.add("rt");
ak.add("mom");
al.addAll(ak);
System.out.println(al);
}
}
class MyArrayList<T> implements Iterator //actual ArrayList ke tarah Generic datatype yahi Iterator bhi implement
{
int size1;
Object objects[];
float growth=0.5f;
int index=-1;
int next=0;
public MyArrayList()
{
size1=10;
objects=new Object[size1];
}
public MyArrayList(int size1)
{
this.size1=size1;
objects=new Object[size1];
}
public void add(T obj)
{
if(index+1==size1)
{
int tempSize1=size1+new Float(size1*growth).intValue();
Object tempObj[]=new Object[tempSize1];
for(int i=0;i<size1;i++)
tempObj[i]=objects[i];
size1=tempSize1;
objects=tempObj;
}
objects[++index]=obj;
}
public boolean set(int j,T obj)
{
if(j<0)
return false;
else if(j>index)
{
	add(obj);
	return true;
}
else
{
	objects[j]=obj;
	return true;
	}
} 
public String toString()
{
String str="";
for(int i=0;i<=index;i++)
{
if(i==0)
str+="["+objects[i].toString();
else if(i==index)
str+=","+objects[i].toString()+"]";
else
str+=","+objects[i].toString();
}
return str;
}
public void addAll(T o[])
{
for(int i=0;i<o.length;i++)
add(o[i]);
}
public void addAll(Collection c)
{
	Iterator i=c.iterator();
	while(i.hasNext())
	{
		add((T)i.next());
	}
}
int size1()
{
return index+1;
}
int capacity()
{
return size1;
}
public boolean isEmpty()
{
return index==-1;
}
public boolean hasNext()
{
if(next>index)
return false;
else
return true;
}
public Object next()
{
return objects[next++];
}
public void remove()
{index--;}
Iterator iterator()//same class me hi implement isiliye iterator() override
{
return this;
}
}