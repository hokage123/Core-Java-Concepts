//CheckArrayType
//Array reflection kaa part getComponentType() se pata chalega array kis type kaa getLength() me array pass toh uski length nikaal kr dega
import java.lang.reflect.Array;
class Anki641
{
public static void main(String... s)
{
int[] z={1,2,3};
Class type=z.getClass();
if(type.isArray())
{
Class elementType=type.getComponentType();
System.out.println("Array of"+elementType);
System.out.println("Length"+Array.getLength(z));
}
}
}