public class LocalInnerClassDemo 
{

    	void display() 
	{

            class Inner 
		{
            		void show() 
			{
                		System.out.println("This is a local inner class.");
            		}
        	}

        
        Inner obj = new Inner();

        
        obj.show();

    	}

    	public static void main(String[] args) 
	{

        	LocalInnerClassDemo outer = new LocalInnerClassDemo();

        
        	outer.display();
    	}
}