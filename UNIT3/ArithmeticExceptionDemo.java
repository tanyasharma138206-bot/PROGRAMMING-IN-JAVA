class ArithmeticExceptionDemo
{
    public static void main(String[] args)
    {
        int a = 20;
        int b = 5;

        try
        {
            
            int addition = a + b;
            System.out.println("Addition = " + addition);

            
            int subtraction = a - b;
            System.out.println("Subtraction = " + subtraction);

            
            int multiplication = a * b;
            System.out.println("Multiplication = " + multiplication);

            int division = a / b;
            System.out.println("Division = " + division);

            
            int modulus = a % b;
            System.out.println("Modulus = " + modulus);

            
            int x = 10;
            int y = 0;
            int result = x / y;

            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        }
    }
}