package programmingtest;

public class primenumber 
{
	public static void main(String[] args)
	{
		int n=73;
		int b=2;
		int count=0;
		while(b<=n/2)
		{
			if(n%b==0)
			{
				count++;
				break;
			}
			b++;
		}
		if(count==1)
		{
			System.out.println("is not a prime number");
		}
		else
		{
			System.out.println("is is a prime number");
		}
		
	}

}
