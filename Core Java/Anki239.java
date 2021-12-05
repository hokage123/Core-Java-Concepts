class Anki239
{
final Anki239a d;
Anki239(Anki239a d)
{
this.d=d;
System.out.println(d);
}
}
class Anki239a
{
int x=10;
int y=20;
}
class Anki239b
{
public static void main(String... s)
{
Anki239a d1=new Anki239a();
Anki239 r=new Anki239(d1);
Anki239a d2=new Anki239a();
d1=d2;
r=new Anki239(d1);
}
}