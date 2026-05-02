package Filehadling;

public class naan
{

	public static void main(String[] args)
	{
		String s=null;
		try
		{
			System.out.println(s.hashCode());
		}
		catch(NullPointerException e)
		{
			System.out.println("handled");
		}
		catch(Exception e)
		{
			System.out.println("handledd");
		}
	}
	

}