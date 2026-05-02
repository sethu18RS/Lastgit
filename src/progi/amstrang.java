package progi;

public class amstrang {
	public static void main(String[] args) {
		int no=370;
		int copy=no;
		int sum=0;
		
        while (no!=0) {
        	int rem=no%10;
        	sum=sum+(rem*rem*rem);
        	no=no/10;
			
		}
        if(copy==sum)
        {
        	System.out.println("it is an amstrong number");
        }
        else {
			System.out.println("ille");
		}
	}

}
