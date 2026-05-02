package Exceptionhandling;

public class Tester 
{

	public static void main(String[] args) 
	{
		System.out.println("..main starts...");
		String s =null;
		try
		{
			System.out.println(s.hashCode());
		}
		catch(NullPointerException d)
		{
			System.out.println("handled");
		}

	}

}
