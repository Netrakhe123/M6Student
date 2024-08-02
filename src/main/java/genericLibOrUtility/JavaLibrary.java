package genericLibOrUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * this is a class contains with all java related generic functions
 */
public class JavaLibrary 
{
/**
 * this method is to create random number
 * @param bound
 * @return
 */
public int generateRandomNumber(int bound)
{
	Random r = new Random();
	int num = r.nextInt(bound);
	return num;
}
public String CalendarHandling(String FormatType)
{
	Calendar cal = Calendar.getInstance();
	Date d = cal.getTime();
	SimpleDateFormat sdf = new SimpleDateFormat(FormatType);
	String date = sdf.format(d);
	return date;
}
}














