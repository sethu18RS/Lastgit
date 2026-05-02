package Thread;

class Sample implements Runnable
{
	public void run()
	{
	for(int i=1; i<=10; i++)
	{
		System.out.println(i);
	
	try
	{
		Thread.sleep(2000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	}
	}
}
class Demo implements Runnable
{
	public void run()
	{
		for(int j=101; j<=110; j++)
		{
			System.out.println(j);
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}
public class viji {
	public static void main(String[] args) {
		Sample s=new Sample();
		Thread t1=new Thread(s);
		t1.start();
		Demo d=new Demo();
		Thread t2=new Thread(d);
		t2.start();
	}

}
