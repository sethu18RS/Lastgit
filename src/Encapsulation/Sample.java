package Encapsulation;
class ram 
{
private int a=23;
public int geta()
{
	return a;
}
public void set(int a)
{
	this.a=a;
}
}

public class Sample
{
	public static void main(String[] args)
	{
		ram r=new ram();
		System.out.println(r.geta());
		r.set(400);
		System.out.println(r.geta());
	}
}


