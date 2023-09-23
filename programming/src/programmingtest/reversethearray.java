package programmingtest;

public class reversethearray {

	public static void main(String[] args) {
		int[]a= {40,30,20,10};
		int[]b=new int[a.length];
		int k=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[k]=a[i];
			k++;
		}
		for(int j=0;j<=b.length-1;j++)
		{
			System.out.println(b[j]);
		}
		
	}
}
		
			
	


