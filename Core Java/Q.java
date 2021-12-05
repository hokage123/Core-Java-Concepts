interface F
{int d;
}
class Q implements F
{public static void main(String... s)
{
F f=new Q();
System.out.println(F.d);
}
}