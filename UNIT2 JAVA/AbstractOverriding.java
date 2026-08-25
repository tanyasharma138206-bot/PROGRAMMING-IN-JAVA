Java Program: Overriding of Abstract Class

abstract class Animal
{
    abstract void sound();
}
class Dog extends Animal
{
    public void sound()
    {
        System.out.println("Dog barks");
    }
}
class AbstractOverriding
{
    public static void main(String args[])
    {
        Dog d = new Dog();

        d.sound();
    }
}



