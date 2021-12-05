class Anki194
{
	void delete(int c[])
	{
		int d[],i,j,n=0,s=0,f=0;
		for(i=0;i<c.length;i++)
			for(j=0;j<i;j++)
			{
				if(c[i]==c[j])
				{	
				n++;
				break;
				}
			}
			d=new int[c.length-n];
			for(i=0;i<c.length;i++)
			{
		for(j=0;j<i;j++)
			{
				if(c[i]==c[j])
				{
					f++;
					break;
				}
				else
					f=0;
			}
			if(f==0)
			{
				d[s++]=c[i];
				
			}
			}
			intersection(new int[]{1,9,8,8,9,7},d);
	}
	void intersection(int a[],int b[])
	{
		int c[],i,j,n=0,f=0,s=0;
		for(i=0;i<b.length;i++)
		{	
		for(j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{	
				f++;
				break;
				}
				else
					f=0;
			}
			if(f>0)
				n++;
		}
			c=new int[n];
			for(i=0;i<b.length;i++)
			{
			for(j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{	
				f++;
				break;
				}
				else
					f=0;
			}
			if(f>0)
			c[s++]=b[i];
			}
			for(i=0;i<c.length;i++)
				System.out.println(c[i]);
	}
public static void main(String... s)
{
Anki194 t=new Anki194();
t.delete(new int[]{45,1,45,2,8,2,3});
}
}