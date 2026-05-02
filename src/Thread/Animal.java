package Thread;

public class Animal {
	void noise() {
		System.out.println("love");
	}
}

class cat extends Animal
{
	void noise()
	{
		System.out.println("meow meow");
	}
}
class dog extends Animal{
	void noise() {
		System.out.println("bow bow");
	}
}
class snake extends Animal{
	void nois()
	{
		System.out.println("his bus");
	}
}
class steam{
	public static void ansim(Animal a) {
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
