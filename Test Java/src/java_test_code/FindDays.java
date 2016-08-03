package java_test_code;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FindDays {

	public static void main(String args[]) throws ParseException{
	     Calendar cal1 = new GregorianCalendar();
	     Calendar cal2 = new GregorianCalendar();

	     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	     Date date = sdf.parse("02/08/2016");
	     cal1.setTime(date);
	     date = sdf.parse("10/08/2016");
	     cal2.setTime(date);

	     System.out.println("Days= "+ daysBetween(cal1.getTime(),cal2.getTime()));
	}
	
	 public static long daysBetween(Date d1, Date d2){
         
		 //in milliseconds
         long diff = d2.getTime() - d1.getTime();

         long diffSeconds = diff / 1000 % 60;
         long diffMinutes = diff / (60 * 1000) % 60;
         long diffHours = diff / (60 * 60 * 1000) % 24;
         long diffDays = diff / (24 * 60 * 60 * 1000);
         
         
         return diffDays;
	 }
	 
}
