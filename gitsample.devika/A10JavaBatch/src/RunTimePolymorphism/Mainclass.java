package RunTimePolymorphism;
class Animal
{
	void noise()
	{	
		System.out.println("some noise");
	}
}
class Cat extends Animal
{
	void noise()
	{	
		System.out.println("Meow Meow");
	}
}
class Dog extends Animal
{
	void noise()
		{	
			System.out.println("Bow Bow");
		}
}
class Snake extends Animal
{
	void noise()
		{	
			System.out.println("Hiss Buss");
		}
}
class Stimulator
{
	static void ansim(Animal a)
	{
		a.noise();
	}
}
 public class Mainclass 
 {

	public static void main(String[] args) throws InterruptedException
	{
	  Cat c=new Cat();
	  System.out.println(c);
	  Thread.sleep(1000);
	  Stimulator.ansim(c);
	  Dog d=new Dog();
	  Stimulator.ansim(d);
	  Snake s=new Snake();
	  Stimulator.ansim(s);
	}

}
