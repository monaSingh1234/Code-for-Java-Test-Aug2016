package java_test_code;

public class DivideBy2 {

    public static void main(String[]args)
    {
    
    int num=16;
    int denominator=2;
    
	int count=0; 
	while(num>=2) 
	{ 
	num=num-denominator; 
	count++; 
	} 
    
	System.out.println( "Result: "+ count);
	
	
    }
}
