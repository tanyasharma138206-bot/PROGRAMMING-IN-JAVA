interface Animal {
    void eat();
}

interface Dog extends Animal {
    void bark();
}

class PetDog implements Dog {

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class InterfaceExtendDemo {

    public static void main(String[] args) {

        PetDog obj = new PetDog();

        obj.eat();
        obj.bark();
    }
}