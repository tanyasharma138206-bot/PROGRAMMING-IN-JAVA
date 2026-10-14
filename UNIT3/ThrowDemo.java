public class ThrowDemo 
{
    public static void main(String[] args) 
	{

        	int age = 16;

        	try 
		{
            		if (age < 18) 
			{
                		throw new ArithmeticException("You are not eligible to vote.");
            		}

            			System.out.println("You are eligible to vote.");
        	}

        	catch (ArithmeticException e) 
		{
            		System.out.println("Exception: " + e.getMessage());
        	}

        	System.out.println("Program continues normally.");
    	}
}