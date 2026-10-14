import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormatDemo 
{

    public static void main(String[] args) 
	{

        	Date date = new Date();

        	SimpleDateFormat format1 =
                new SimpleDateFormat("dd-MM-yyyy");

        	SimpleDateFormat format2 =
                new SimpleDateFormat("dd/MM/yyyy");

        	SimpleDateFormat format3 =
                new SimpleDateFormat("EEEE, MMMM dd, yyyy");

        	SimpleDateFormat format4 =
                new SimpleDateFormat("dd-MMM-yyyy");

        	System.out.println("Format 1: " + format1.format(date));
        	System.out.println("Format 2: " + format2.format(date));
        	System.out.println("Format 3: " + format3.format(date));
        	System.out.println("Format 4: " + format4.format(date));
    	}
}