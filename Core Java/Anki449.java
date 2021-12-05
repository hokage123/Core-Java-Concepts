//Shallow Clonning 
class Temp
{
int g;
Temp(int g)
{
this.g=g;
}
}
class Anki449 implements Cloneable
{
int x=10;
Temp t;
Anki449(int a)
{
t=new Temp(a);
}
public Anki449 clone()
{
//shallow copy
try
{
return (Anki449)super.clone();
}
catch(CloneNotSupportedException e)
{
return null;
}
}
public static void main(String... s)
{
Anki449 c=null;
Anki449 m=new Anki449(100);
System.out.println("m.t.g"+m.t.g);
System.out.println("m.x"+m.x);
try
{
c=m.clone();
}
catch(Exception e)
{}
System.out.println("c"+c.t.g);
System.out.println("c"+c.x);
c.t.g=3000;
c.x=30;
System.out.println("m after changes"+m.t.g);//t ho raha hai shared m me change c me bhi apne aap change
System.out.println("m after changes"+m.x);
if(m.t==c.t)
{
System.out.println("shallow clonning");
}
}
}