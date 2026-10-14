public class InnerClassDemo 
{

        class Inner 
	{
        
        	void display() 
		{
            		System.out.println("This is a simple inner class.");
        	}
    	}

    	public static void main(String[] args) 
	{

        
        	InnerClassDemo outer = new InnerClassDemo();

                InnerClassDemo.Inner inner = outer.new Inner();

                inner.display();
    	}
}