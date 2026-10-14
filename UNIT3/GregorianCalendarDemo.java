import java.util.GregorianCalendar;

public class GregorianCalendarDemo 
{

    public static void main(String[] args) 
	{

        	GregorianCalendar cal = new GregorianCalendar();

        	System.out.println("Current Date: " + cal.getTime());

        	System.out.println("Year: " + cal.get(GregorianCalendar.YEAR));

        	System.out.println("Month: "
                + (cal.get(GregorianCalendar.MONTH) + 1));

        	System.out.println("Day of Month: "
                + cal.get(GregorianCalendar.DAY_OF_MONTH));

        	System.out.println("Day of Week: "
                + cal.get(GregorianCalendar.DAY_OF_WEEK));

        	System.out.println("Day of Year: "
                + cal.get(GregorianCalendar.DAY_OF_YEAR));

        	System.out.println("Week of Year: "
                + cal.get(GregorianCalendar.WEEK_OF_YEAR));

        	System.out.println("Hour: "
                + cal.get(GregorianCalendar.HOUR));

        	System.out.println("Minute: "
                + cal.get(GregorianCalendar.MINUTE));

        	System.out.println("Second: "
                + cal.get(GregorianCalendar.SECOND));

        	System.out.println("Leap Year: "
                + cal.isLeapYear(cal.get(GregorianCalendar.YEAR)));
    	}
}