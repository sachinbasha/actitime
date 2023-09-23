package programmingtest;

public class spynumber 
{
	public static void main(String[] args) 
	{
		int n=1324;
		int sum=0;
		int mul=1;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			mul=mul*rem;
			n=n/10;
			
		}
		if(sum==mul)
		{
			System.out.println("the given number is spy");
		}
		else
		{
			System.out.println("the given number is not a spy");
		}
		
	}

}
