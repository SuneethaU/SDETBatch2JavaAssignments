/*Program # 7
Array - which number is Even, which Number is Odd
*/
package basics;

public class EvenOddNumbersOfArray {

	public static void main(String[] args) {

				// TODO Auto-generated method stub
				
				int [] a= {1,7,2,4,3,5,11,13};
				int sum=0;
				long mul = 1;
				for( int index = 0 ;index <a.length ; index++) {
					if(a[index] % 2 == 0) {
							System.out.println("The number is Even "+a[index]);
					}
					else {
						System.out.println("The number is odd "+a[index]);
					}
				
			}
		}
}
