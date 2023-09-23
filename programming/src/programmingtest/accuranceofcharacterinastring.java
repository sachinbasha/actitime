package programmingtest;

public class accuranceofcharacterinastring {

	public static void main(String[] args) {
		String s="veeranna";
		char[] ch = s.toCharArray();
		boolean[]b=new boolean[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			if(b[i]==false)
			{
			
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
				count++;
				b[j]=true;
				}
			}
			}
			if(count>1)
			{
				System.out.println(ch[i]+"is present"+count+"times");
		
			}
		}

	}



	}


