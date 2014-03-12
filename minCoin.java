
public class minCoin {

	public static void main(String arg[])
	{
		int denoms[]={1,2,3};
		int sum=2;
		int i,j;
		int lookup[]=new int[sum+1];
		int mintemp,minCoin=Integer.MAX_VALUE;
		int overAllmin=Integer.MAX_VALUE;
		for(i=0;i<sum+1;i++)
			  lookup[i]=0;
		for(i=0;i<denoms.length;i++)
		{
			int coin = denoms[i];
			for(j=coin;j<=sum;j++)
			{
				
					mintemp = lookup[sum-coin]+1;
					
					if(lookup[j]!=0)
					lookup[j]=Math.min(mintemp, lookup[j]);
					else
					lookup[j]=mintemp;
					if(j == sum && overAllmin > lookup[j])
						overAllmin = lookup[j];
			}

		}
		System.out.println("Value="+overAllmin);
		
	}
	
}
