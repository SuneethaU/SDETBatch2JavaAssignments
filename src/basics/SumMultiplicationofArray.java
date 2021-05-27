/*Program # 6
Array with Duplicate Numbers -
Sum of all numbers in an Array
Multiplication of all Numbers in an Array*/


package basics;
public class SumMultiplicationofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {1,7,2,4,3,5,11,13};
		int sum=0;
		long mul = 1;
		for( int index = 0 ;index <a.length ; index++) {
			sum = sum+a[index];
			mul = mul*a[index];
		}
		System.out.println("Sum of the array of elements is : "+ sum);
		System.out.println("Multiplication of the array of elements is : "+ mul);
		
	}

}
