class Anki320
{
public static void main(String... s)
{
 new Anki320().printTriangleWise(new int[]{23,46,78,90,45,61,34,45,11,99,89,78,81,23,56,41});
}
void printTriangleWise(int[] n)
{
int i,j,k,c=0,d=0;
for(i=0;i<n.length;i++)
{
	if((i*(i+1))/2>=n.length)
	{
		for(j=0;j<=i;j++)
		{
			for(k=0;k<(2*i-1);k++)
			{
			if(k<=(i+j) && k>=(i-j))
			{
				if(c<n.length)
				System.out.print(n[c++]+"\t");
			}
			else
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		break;
	}
}
}
}