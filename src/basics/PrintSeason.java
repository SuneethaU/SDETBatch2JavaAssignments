//Program # 3
//Output - Print the Season
package basics;
import java.util.Scanner;

public class PrintSeason{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter Month No:");
		int MonthNo = myObj.nextInt();  // Read user input
	    switch(MonthNo) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Season for the Given Month is Summer");
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("Season for the Given Month is Winter");
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("Season for the Given Month is Rainy");
			break;
	    }
	}
}
