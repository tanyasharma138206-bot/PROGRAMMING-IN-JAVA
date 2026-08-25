Java Program: Multiple Inheritance Using Interfaces

interface A
{
    void displayA();
}
interface B
{
    void displayB();
}
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
class MultipleInheritance
{
    public static void main(String args[])
    {
        Demo d = new Demo();

        d.displayA();
        d.displayB();
    }
}
