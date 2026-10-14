public class ExceptionPropagationDemo 
{

    	static void method1() 	
	{
        	method2();
    	}

    	static void method2() 
	{
        	method3();
    	}

    	static void method3() 
	{
        	int a = 10;
        	int b = 0;

        	int result = a / b;   // Exception occurs here
        	System.out.println("Result = " + result);
    	}

    	public static void main(String[] args) 
	{

        	try 
		{
            		method1();
        	}

        	catch (ArithmeticException e) 
		{
            		System.out.println("Exception caught: " + e);
        	}

        	System.out.println("Program continues normally.");
    	}
}