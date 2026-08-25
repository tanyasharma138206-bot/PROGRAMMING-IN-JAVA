Java Program: Multiple Inheritance Using Interfaces


// First interface
interface A
{
    void displayA();
}

// Second interface
interface B
{
    void displayB();
}

// Class implementing two interfaces
class Demo implements A, B
{
    public void displayA()
    {
        System.out.println("Method of Interface A");
    }

    public void displayB()
    {
        System.out.println("Method of Interface B");
    }
}

// Main class
class MultipleInheritance
{
    public static void main(String args[])
    {
        Demo d = new Demo();

        d.displayA();
        d.displayB();
    }
}
