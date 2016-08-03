package java_test_code;

import java.util.Scanner;

public class armstronNum {

	public static void main(String[] args) {
		Scanner s2=new Scanner(System.in);
		System.out.println("Please Enter a digit to check if it a Armstrong number or not:");
		int n=s2.nextInt();
		
		int temp=n;
		int sum=0;
		int temp1;
		
		while(temp>0){
			temp1=temp%10;
			temp=temp/10;
			sum=sum+(temp1*temp1*temp1);
			
		}
		if (n==sum){
			System.out.println("Given number:"+n+" is an Armstrong number");
		}else{
			System.out.println("Given number:"+n+" is not an Armstrong number");
		}

	}

}
