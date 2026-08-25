// Parent Class
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child Class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main Class
public class SimpleInheritance {

    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.eat();   // Method inherited from Animal
        obj.bark();  // Method of Dog
    }
}