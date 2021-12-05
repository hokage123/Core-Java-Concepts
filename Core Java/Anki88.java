interface Anki86
{
default void show()
{
System.out.println("Anki86");
}
}
interface Anki87
{
default void show()
{
System.out.println("Anki87");
}
}
interface Anki88 extends Anki86,Anki87
{
	default void show()
{
System.out.println("show");
}

}