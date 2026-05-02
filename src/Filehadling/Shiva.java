package Filehadling;

public class Shiva {

	public static void main(String[] args) {
		
		int[] arr= {1,2,2,3};
		try
		{
			System.out.println(arr[6]);
			System.out.println(" main starts");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}
	
		finally
		{
			System.out.println("404 error");
		}
		System.out.println("main ends");
	}

}
