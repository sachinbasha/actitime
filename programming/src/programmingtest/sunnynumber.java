package programmingtest;

public class sunnynumber 
{
	
	
	public static void main(String[] args) 
	{
		int n=47;
		n=n+1;
		int num=1;
		int count=0;
		while(num<=n/2)
		{
			if(num*num==n)
			{
				count++;
				break;
				
			}
			num++;
		}
		if(count==1)
		{
			System.out.println(n+ " its a sunny number");
		}
		else
		{
			System.out.println(n+"its not a sunny number");
		}
		
		
	}

}
