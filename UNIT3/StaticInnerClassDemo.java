public class StaticInnerClassDemo 
{

    
    static class Inner 
	{

        	void display() 
		{
            		System.out.println("This is a static inner class.");
        	}
    	}

    	public static void main(String[] args)
 
	{

                StaticInnerClassDemo.Inner obj =
                new StaticInnerClassDemo.Inner();

                obj.display();
    	}
}