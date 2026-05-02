package Exceptionhandling;

public class Sample2 {

	public static void main(String[] args)
	{
		System.out.println("...main starts.....");
		try
		{
			int x=1/0;
		}

		catch(Exception e)
		{
			System.out.println("handled");
		}
		
		
		System.out.println("...main ends...");


	}

}
