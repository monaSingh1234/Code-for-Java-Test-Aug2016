package java_test_code;

import java.time.LocalDate;
import java.util.Date;

public class one_date_diff {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); 
		int year = today.getYear(); 
		int month = today.getMonthValue(); 
		int day = today.getDayOfMonth(); 
		System.out.printf("Year :%d  Month :%d  day :%d \t %n", year, month, day); 
		//String date2="2017-09-02";

		

	}

}
