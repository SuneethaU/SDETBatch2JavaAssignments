package basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in); 	
		int n = myObj.nextInt(); // Read user input
		    System.out.println("Enter Number: " + n);
		    System.out.println("Number is: " + n);
		    for(int i =0 ;i<n/2;i++) {
		    	if(n/i==0) {
		    		System.out.println("Given Number is not a Prime Number"+n);
		    	}
		    }
	}

}
