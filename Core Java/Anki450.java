//deep clonning
class Temp implements Cloneable
{
int g;
Temp(int g)
{
this.g=g;
}
public Temp clone()
{
try
{
return (Temp)super.clone();
}
catch(Exception e)
{
return null;
}
}
}
class Anki450 implements Cloneable
{
int x=10;
Temp t;
Anki450(int a)
{
t=new Temp(a);
}
public Anki450 clone()
{
//deep copy
try
{
Anki450 d=(Anki450)super.clone();
d.t=t.clone();//associated obj par explicitly clone() chalana padega
return d;
}
catch(Exception e)
{
return null;
}
}
public static void main(String... s)
{
Anki450 c=null;
Anki450 m=new Anki450(100);
System.out.println("m"+m.t.g);
try
{
c=m.clone();
//c.t=m.t.clone();//yehi kaam method me kar chuke hai
}
catch(Exception e)
{}
System.out.println("c"+c.t.g);
c.t.g=300;
System.out.println("m after changes"+m.t.g);
if(m.t!=c.t)
System.out.println("deep clonning");
}
}