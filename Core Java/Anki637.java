//ArrayFill
import java.util.Arrays;
class Anki637
{
public static void main(String... s)
{
double[] data=new double[5];//an array of 5 value of type double
Arrays.fill(data,1.0);//fill all elements of data with 1.0
for(int i=0;i<data.length;i++)
System.out.println(data[i]);
//fill() me ek array aur usi type kaa data pass puri array us data se fill
}
}