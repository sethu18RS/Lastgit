package Thread;

class Whatsapp implements Runnable
{
	public void run()
	{
		System.out.println("whatsapppage");
	}
}
class Instagram extends Thread
{
	public void run()
	{
		System.out.println("instagram page");
	}
}
public class sethu {
	public static void main(String[] args) {
		Whatsapp w=new Whatsapp();
		Thread t1=new Thread(w);
		t1.start();
		Instagram i=new Instagram();
		Thread t2=new Thread(i);
		t2.start();
	}

}
