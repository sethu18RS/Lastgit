package normal;

public class run {
	void kgf()
	{
		System.out.println("nice");
	}
	public static void main(String[] args)
	{
		run r=new run();
		yash.watch(r);
	}


}
class yash{
	static void watch(run A)
	{
		A.kgf();
	}
}
class nimmi{
	static void watch(run B)
	{
		B.kgf();
	}
}
