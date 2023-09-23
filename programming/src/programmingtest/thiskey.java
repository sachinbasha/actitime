package programmingtest;

public class thiskey 
{
     int bid;
     String title;
     public void gouda() {
    	 System.out.println(bid);
    	 System.out.println(title);
     }
	public void sachin(int tid,String itle)
	{
		bid=tid;/*hence make it as this.bid=bid or change the variable names present in sachin mathod*/
		title=itle;
		System.out.println(bid);
		System.out.println(title);
		
		
	}
	public static void main(String[] args) 
	{
		 thiskey obj=new  thiskey();
		obj.sachin(10,"mahabhart");
		obj.gouda();
	

	}

}
