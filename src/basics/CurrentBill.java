//Program # 1
package basics;

import java.io.Serializable;
import java.util.Scanner;

public class CurrentBill {

	public static void main(String[] args) {
		float billAmount;
		int Noofunits;
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter billType:");
	    String billType = myObj.nextLine();  // Read user input
	    switch(billType) {
		case "House":
			System.out.println("Enter Noofunits:");
		    Noofunits = myObj.nextInt(); // Read user input
		    System.out.println("Noofunits is: " + Noofunits);
			if(Noofunits <  101) {
				billAmount = Noofunits*3;
				System.out.println("Bill amount is"+billAmount);
			}else if((Noofunits>100)&&(Noofunits < 200)){
				billAmount = Noofunits*4;
				System.out.println("Bill amount is"+billAmount);
			}
			else {
				System.out.println(Noofunits+"No of units entered is not the range");
			}
			break;
		case "Commercial":
			System.out.println("Enter Noofunits:");
		    Noofunits = myObj.nextInt(); // Read user input
		    System.out.println("Noofunits is: " + Noofunits);
			if(Noofunits < 101) {
				billAmount = Noofunits*10;
				System.out.println("Bill amount is"+billAmount);
			}else if((Noofunits > 100) && (Noofunits < 200)){
				billAmount = Noofunits*20;
				System.out.println("Bill amount is"+billAmount);
			}	
			else {
				System.out.println(Noofunits+"No of units entered is not the range");
			}
			break;
		default:
			System.out.println("Invalid Bill Type given"+billType);
		}
		
		
	}

}
