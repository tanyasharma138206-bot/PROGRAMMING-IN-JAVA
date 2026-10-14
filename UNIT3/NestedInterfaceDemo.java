public class NestedInterfaceDemo 
{

    
    	interface Message 
	{
        	void display();
    	}

      static class Test implements Message 
	{

        	public void display() 
		{
            		System.out.println("This is a nested interface.");
        	}
    	}

    	public static void main(String[] args) 
	{

                Test obj = new Test();

                obj.display();
    	}
}