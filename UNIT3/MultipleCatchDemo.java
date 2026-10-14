public class MultipleCatchDemo 
{
    public static void main(String[] args) 
	{

        	try 
		{
            		int a = 10;
            		int b = 0;

            		int result = a / b;
            		System.out.println("Result = " + result);

            		int arr[] = {10, 20, 30};
            		System.out.println(arr[5]);
       		}

        	catch (ArithmeticException e) 
		{
            		System.out.println("Arithmetic Exception: Cannot divide by zero.");
        	}

        	catch (ArrayIndexOutOfBoundsException e) 
		{
            		System.out.println("Array Exception: Array index is out of bounds.");
        	}

        	catch (Exception e) 
		{
            		System.out.println("General Exception: " + e);
        	}

        	System.out.println("Program continues normally.");
    	}
}