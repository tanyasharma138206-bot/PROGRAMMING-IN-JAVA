import java.util.Calendar;

public class DateAddSubtractDemo 
{

    public static void main(String[] args) 
	{

        	Calendar cal = Calendar.getInstance();

        	System.out.println("Current Date and Time: " + cal.getTime());

        	
        	cal.add(Calendar.DAY_OF_MONTH, 5);
        	System.out.println("After adding 5 days: " + cal.getTime());

        	
        	cal.add(Calendar.DAY_OF_MONTH, -3);
        	System.out.println("After subtracting 3 days: " + cal.getTime());

        	
        	cal.add(Calendar.MONTH, 2);
        	System.out.println("After adding 2 months: " + cal.getTime());

        	
        	cal.add(Calendar.MONTH, -1);
        	System.out.println("After subtracting 1 month: " + cal.getTime());
    	}
}