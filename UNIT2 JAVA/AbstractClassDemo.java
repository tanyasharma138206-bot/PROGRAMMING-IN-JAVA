Java Program: Abstract Class

abstract class Shape
{
    abstract void area();
    void display()
    {
        System.out.println("This is a shape");
    }
}
class Circle extends Shape
{
    void area()
    {
        int r = 5;
        double a = 3.14 * r * r;

        System.out.println("Area of Circle = " + a);
    }
}
class AbstractClassDemo
{
    public static void main(String args[])
    {
        Circle c = new Circle();

        c.display();
        c.area();
    }
}
