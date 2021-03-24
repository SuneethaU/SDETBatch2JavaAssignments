//Program # 4
//Given number is a Prime number or Not?
 
package basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false; 
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter Number ");
		int n = myObj.nextInt(); // Read user input
		   for(int i =2 ; i<n/2; i++) {
		    	if(n % i == 0) {
		    		flag = true;
		    		break;
		    	}
		    }
		    if(flag == true){
	    		System.out.println("Given Number "+n+" is not a Prime Number");
	    	}
	    	else{
	    		System.out.println("Given Number "+n+" is a Prime Number");
	    	}
	}

}
