//MyLinkedList
class Link
{
public int iData;
public Link next;
public Link(int id)
{
iData=id;
}
public String toString()
{
return "{"+iData +"}";
}
}
class LinkList
{
private Link first;
LinkList()
{
first=null;
}
void insertFirst(int id)
{
Link newLink=new Link(id);
newLink.next=first;
first=newLink;
}
public Link removeFirst()
{
Link temp=first;
first=first.next;
return temp;
}
public Link find(int key)
{
Link temp=first;
while(temp!=null)
{
if(temp.iData==key)
break;
temp=temp.next;
}
return temp;
}
public Link delete(int key)
{
Link temp,temp1=null,aLink;
if(first.iData==key)
aLink=removeFirst();
else
{
temp=first;
while(temp!=null)
{
if(temp.iData==key)
break;
temp1=temp;
temp=temp.next;
}
aLink=temp;
temp1.next=temp.next;
}
return aLink;
}
public boolean isEmpty()
{
return(first==null);
}
public String toString()
{
String str="";
Link temp=first;
while(temp!=null)
{
str+=temp.toString();
temp=temp.next;
}
return str;
}
}
class Anki566
{
public static void main(String... s)
{
LinkList theList=new LinkList();
theList.insertFirst(22);
theList.insertFirst(44);
theList.insertFirst(66);
theList.insertFirst(88);
System.out.println(theList);
System.out.println(theList.removeFirst());
System.out.println(theList);
Link ln=theList.find(44);
System.out.println(ln);
Link aLink=theList.delete(44);
System.out.println("deleted"+aLink);
while(!theList.isEmpty())
{
 aLink=theList.removeFirst();
System.out.println("deleted"+aLink);
}
System.out.println("");
System.out.println(theList);
}
}