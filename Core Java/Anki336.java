class Anki336
{
void makeAllElementZero(int c[][])
{
int i,j,k,l,count;
 for(i=0;i<c.length;i++)
 for(j=0;j<c[i].length;j++)
 {
	 count=0;
	  for(k=0;k<c.length;k++)
 {
 for(l=0;l<c[i].length;l++)
 {
	 if(c[k][l]==0)
		 count++;
 }
 }
 if(count!=(c.length*c[i].length))
 {
 if((i-1)>=0)
 c[i-1][j]=0;
 if((i+1)<c.length)
 c[i+1][j]=0;
 if((j-1)>=0)
 c[i][j-1]=0;
 if((j+1)<c[i].length)
 c[i][j+1]=0;
 for(k=0;k<c.length;k++)
 {
 for(l=0;l<c[i].length;l++)
 {
 System.out.print(c[k][l]+"\t");
 }
 System.out.print("\n");
 }
 System.out.println();
 }
 }
}
public static void main(String... s)
{
new Anki336().makeAllElementZero(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});
}
}