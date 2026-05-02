package checked;

public class flipkartdotcom 
{
	static void buy() throws FlippuException
	{
		int bill=4999;
		if(bill>5000)
		{
			System.out.println("500 discout");
		}
		else
		{
	     throw new FlippuException("discount illa");
		}
	}
	public static void main(String[] args) {
		try
		{
			
			buy();
		}
		catch(FlippuException e)
		{
			System.out.println(e.getmsg());
		}
	
	}
     class FlippuException extends Exception
	{
		String msg;
		FlippuException(String msg)
		{
			this.msg= msg;
		}
		public String getmsg() {
			return msg;
			
		}
	}
}


