package program;

public class Don {
	public static void main(String[] args) {
		int no=232;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=(sum*10)+rem;
			no=no/10;
			
		}
		if(copy==sum)
		{
			System.out.println("it is a polyndrome number");
		}
		
		
	}

}
