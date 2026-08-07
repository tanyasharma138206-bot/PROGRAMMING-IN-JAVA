class Animal
{
	void eat(){System.out.println("Can eat");}
}
class Dog extends Animal
{
	void bark(){System.out.println("Can bark");}

	public static void main(String args[])
	{
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
}
class Cat extends Animal
{
	void meow(){System.out.println("Can meow");}

	public static void main (String args[])
	{
		Cat c = new Cat();
		c.eat();
		c.meow();
	}
}
