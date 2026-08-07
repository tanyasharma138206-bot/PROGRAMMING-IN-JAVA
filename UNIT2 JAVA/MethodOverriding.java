### Java Program: Method Overriding


class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal
{
    // Overriding parent class method
    void sound()
    {
        System.out.println("Dog barks");
    }
}


class MethodOverridingDemo
{
    public static void main(String args[])
    {
        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();
    }
}
