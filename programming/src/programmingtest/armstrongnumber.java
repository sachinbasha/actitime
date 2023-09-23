package programmingtest;

public class armstrongnumber 
{
	public static void main(String[] args) 
	{
		int n=8208;
		int temp=n;
		int temp1=n;
		int count=0;
		int sum=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		while(temp>0)
		{
			int rem=temp%10;
			int count1=count;
			int num=1;
			while(count1>0)
			{
				num=rem*num;
				count1--;
			}
			temp=temp/10;
			sum=sum+num;
			
		}
		if(sum==temp1)
		{
			System.out.println("its a arm strong number");
		}
		else
		{
			System.out.println("its not a arm strong number");
		}
		
	}

}
