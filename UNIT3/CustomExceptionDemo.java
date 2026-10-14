class AgeException extends Exception 
{

    AgeException(String message) 
	{
        	super(message);
    	}
}

public class CustomExceptionDemo 
{

    public static void main(String[] args) 
	{

        	int age = 16;

        	try 
		{
            		if (age < 18) 
			{
                		throw new AgeException("Age is less than 18. Not eligible to vote.");
            		}

            		System.out.println("You are eligible to vote.");
        	}

        	catch (AgeException e) 
		{
            		System.out.println("Custom Exception: " + e.getMessage());
        	}

        	System.out.println("Program continues normally.");
    	}
}