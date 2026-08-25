Java Program: Overriding of Abstract Class

// Abstract class
abstract class Animal
{
    // Abstract method
    abstract void sound();
}

// Child class
class Dog extends Animal
{
    // Overriding abstract method
    public void sound()
    {
        System.out.println("Dog barks");
    }
}

// Main class
class AbstractOverriding
{
    public static void main(String args[])
    {
        Dog d = new Dog();

        d.sound();
    }
}



