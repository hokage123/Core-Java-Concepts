import java.io.*;
class Node
{
Object val;
Node next;
public Node(Object val)
{
this.val=val;
}
public String toString()
{
return"{"+val+"}";
}
}
interface MyIterator
{
boolean hasNext();
Object next();
}
class LinkList implements MyIterator
{
Node head,nxt,hsnxt;
public LinkList()
{
head=null;
}
public MyIterator myIterator()
{
hsnxt=nxt=head;
return this;
}
public boolean hasNext()
{
if(hsnxt!=null)
{
hsnxt=hsnxt.next;
return true;
}
else
{
return false;
}
}
public Object next()
{
 Node temp=nxt;
nxt=nxt.next;
return temp.val;
}
public boolean isEmpty()
{
return (head==null);
}
public void addFirst(Object o)
{
Node newNode=new Node(o);
newNode.next=head;
head=newNode;
}
public void addLast(Object o)
{
Node temp;
temp=head;
if(temp==null)
addFirst(o);
else
{
Node newNode=new Node(o);
while(temp.next!=null)
temp=temp.next;
temp.next=newNode;
}
}
public Object getFirst()
{
if(head!=null)
return head.val;
else
return null;
}
public Object getLast()
{
Node temp;
temp=head;
if(temp==null)
return null;
else
{
while(temp.next!=null)
temp=temp.next;
return temp.val;
}
}
public Object removeFirst()
{
if(head==null)
{
System.out.println("no element to remove");
return null;
}
else
{
Object obj=head.val;
head=head.next;
return obj;
}
}
public Object removeLast()
{
if(head==null)
{
System.out.println("no element to remove");
return null;
}
else if(head.next==null)
{
Object obj=head.val;
head=null;
return obj;
}
else
{
Node temp=head;
while(temp.next.next!=null)
{
temp=temp.next;
}
Object obj=temp.next.val;
temp.next=null;
return obj;
}
}
public String toString()
{
String str="";
Node temp=head;
while(temp!=null)
{
str+=temp.toString();
temp=temp.next;
}
return str;
}
}
class Anki567
{
public static void main(String... s)throws IOException
{
LinkList elmnt=new LinkList();
for(;;)
{
System.out.println("enter 1 for Insertion");
System.out.println("enter 2 for Deletion");
System.out.println("enter 3 to get");
System.out.println("enter 4 for display");
System.out.println("enter 5 for exit");
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
switch(Integer.parseInt(bf.readLine()))
{
case 1:
System.out.println("enter 1 for Inserting at front end");
System.out.println("enter 2 for Inserting at rear end");
System.out.println("enter 3 for back");
switch(Integer.parseInt(bf.readLine()))
{
case 1:
System.out.println("enter the String");
elmnt.addFirst(bf.readLine());
break;
case 2:
System.out.println("enter the String");
elmnt.addLast(bf.readLine());
break;
case 3:
break;
}
break;
case 2:
System.out.println("enter 1 for Deleting at front end");
System.out.println("enter 2 for Deleting at rear end");
System.out.println("enter 3 for back");
switch(Integer.parseInt(bf.readLine()))
{
case 1:
System.out.println("My first string is removed"+elmnt.removeFirst());
break;
case 2:
System.out.println("My Last string is removed"+elmnt.removeLast());
break;
case 3:
break;
}
break;
case 3:
System.out.println("enter 1 for getting at front end");
System.out.println("enter 2 for getting at rear end");
System.out.println("enter 3 for back");
switch(Integer.parseInt(bf.readLine()))
{
case 1:
System.out.println("My first string is"+elmnt.getFirst());
break;
case 2:
System.out.println("My Last string is"+elmnt.getLast());
break;
case 3:
break;
}
break;
case 4:
System.out.println(elmnt);
break;
case 5:
System.exit(0);
break;
}
}
}
}