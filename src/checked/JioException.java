package checked;

public class JioException {
	static void recharge() throws jException
	{
		int rec=199;
		if(rec>200)
		{
		 System.out.println("1 cashback");
		}
		else
		{
			throw new jException("illae");
		}
	}
	public static void main(String[] args) {
		try
		{
			recharge();
		}
		catch(jException e)
		{
			System.out.println(e.geta());
		}

	}

}
class jException extends Exception
{
	String msg;
	jException(String msg) {
		this.msg=msg;
		
	}
	public String geta()
	{
		return msg;
	}
}
