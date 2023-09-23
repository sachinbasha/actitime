package programmingtest;

public class strongnumber 
{
	public static void main(String[] args) 
	{
		int n=145;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			int res=1;
			while(rem>0)
			{
				res=res*rem;
				rem--;
			}
			n=n/10;
			sum=sum+res;
		}
		if(sum==temp)
		{
			System.out.println("its a strong number");
		}
		else
		{
			System.out.println("its not a strong number");
		}
		
	}

}
