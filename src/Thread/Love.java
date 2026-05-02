package Thread;

public class Love {
	void noise() {
		System.out.println("love");
	}
}

class cat extends Love
{
	void noise()
	{
		System.out.println("meow meow");
	}
}
class dog extends Love{
	void noise() {
		System.out.println("bow bow");
	}
}
class snake extends Love{
	void nois()
	{
		System.out.println("his bus");
	}
}
class steam{
	public static void ansim(Love a) {
		a.noise();
		
	}
}
class Mainclass{
	public static void main(String[] args)
	{
		cat c=new cat();
		dog d=new dog();
		snake s=new snake();
		
		steam.ansim(c);
		steam.ansim(d);
		steam.ansim(s);
	}
}

}
