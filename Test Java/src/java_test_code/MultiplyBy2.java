package java_test_code;

import java.util.Scanner;

public class MultiplyBy2 {

	    public static void main(String[]args)
	    {
	        Scanner in = new Scanner(System.in);
	        int result=0;
	        int x=0;        
	        System.out.print("Enter Number :");
	        int num = in.nextInt();
	        
	        while(x<2)
	        {
	            result=result+num;
	            x++;
	        }
	        System.out.print(result);
	    }
	
}
