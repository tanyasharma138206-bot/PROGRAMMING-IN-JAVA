public class ThrowsDemo 
{

    static void checkAge(int age) throws Exception 
	{
        	if (age < 18) 
		{
            		throw new Exception("Age is less than 18.");
        	} 
		else 
		{
            		System.out.println("You are eligible.");
        	}
    	}

    public static void main(String[] args) 
	{

        	try 
		{
            		checkAge(16);
        	}

        	catch (Exception e) 
		{
            		System.out.println("Exception: " + e.getMessage());
        	}

        	System.out.println("Program continues normally.");
    	}
}