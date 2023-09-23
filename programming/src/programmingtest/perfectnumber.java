package programmingtest;

public class perfectnumber 
{
	public static void main(String[] args) 
	{
		int n=28;
		int i=1;
		int sum=0;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				sum=sum+i;
				System.out.println(i);
			}
			i++;
		}
		if(sum==n)
		{
			System.out.println("its a perfet number");
		}
		else
		{
			System.out.println("its not a perfet number");
		}
		
		
	}
		
}
