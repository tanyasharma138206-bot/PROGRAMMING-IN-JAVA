Java Program: Abstract Class

// Abstract class
abstract class Shape
{
    // Abstract method
    abstract void area();

    // Normal method
    void display()
    {
        System.out.println("This is a shape");
    }
}

// Child class
class Circle extends Shape
{
    // Implementing abstract method
    void area()
    {
        int r = 5;
        double a = 3.14 * r * r;

        System.out.println("Area of Circle = " + a);
    }
}

// Main class
class AbstractClassDemo
{
    public static void main(String args[])
    {
        Circle c = new Circle();

        c.display();
        c.area();
    }
}
