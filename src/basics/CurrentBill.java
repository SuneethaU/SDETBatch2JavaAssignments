package basics;

import java.io.Serializable;
import java.util.Scanner;

public class CurrentBill {

	public static void main(String[] args) {
		float billAmount;
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter billType:");

	    String billType = myObj.nextLine();  // Read user input
	    System.out.println("billType is: " + billType);
	    System.out.println("Enter Noofunits:");
	    int Noofunits = myObj.nextInt(); // Read user input
	    System.out.println("Noofunits is: " + Noofunits);
	
		
		switch(billType) {
		case "House":
			if(Noofunits <  101) {
				billAmount = Noofunits*3;
				System.out.println("Bill amount is"+billAmount);
			}else if((Noofunits>100)&&(Noofunits<200)){
				billAmount = Noofunits*4;
				System.out.println("Bill amount is"+billAmount);
			}
			break;
		case "Commercial":
			if(Noofunits < 101) {
				billAmount = Noofunits*10;
				System.out.println("Bill amount is"+billAmount);
			}else if((Noofunits>100)&&(Noofunits<20)){
				billAmount = Noofunits*20;
				System.out.println("Bill amount is"+billAmount);
			}	
			
			break;
			
		}
		
		
	}

}
