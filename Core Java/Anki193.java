class Anki193
{
	void union(int a[],int b[])
	{
		int i,j,c[],d[],n=0,k=0,m=0,p=0;
		j=a.length+b.length;
		c=new int[j];
		for(i=0;i<c.length;i++)
		{
			if(i<a.length)
				c[i]=a[i];
			else
			{
				j=i-a.length;
				c[i]=b[j];
			}
		}	
		
		//for(i=0;i<c.length;i++)
			//System.out.println(c[i]);
			for(i=0;i<c.length-1;i++)
			{
			for(j=i+1;j<c.length;j++)
			{
			if(c[i]==c[j])
			{
				n++;
				break;
			}
			}
			}		
			m=c.length-n;
			d=new int[m];
			for(i=0;i<c.length;i++)
			{
			for(j=i+1;j<c.length;j++)
			{
			if(c[j]==c[i])
			{	
			k=0;	
			break;
			}
			else
			{
				k=1;
			}
			}
			if(k==1)
			{
				d[p]=c[i];
				if(p<d.length-1)
				{
				p++;
				}
			}	
			}
			
		for(i=0;i<d.length;i++)
			System.out.println(d[i]);

//System.out.println(d.length);
		

	}
public static void main(String... s)
{
Anki193 t=new Anki193();
t.union(new int[]{12,12,23,10,86,9},new int[]{45,1,45,8,2});
}
}