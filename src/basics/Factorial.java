package basics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//code to find the factorial of given number
		int num = 5;
		
		int count=1;
		for (int i = 1 ; i <=num; i++) {
			count= count * i;
		}
	System.out.println(count);
	}

}

/*Questions
*https://beginnersbook.com/2015/02/simple-c-programs/
*1. current bill
           if(house)
           1-100   -  units*3;
           100 -200 - units*4;
         else{
    1-100   -  units*10; 
     }
house or comer
units ; - bill
2. Hotel menu
  1. Dosa  30
  2. Idly    20
i/p - item no , no of plates 1 , 3  =30*3 = 90
3. 12 months - 3 season ; 1234- Winter , 5678- Rainy
4. Prime or not 
5. sum/mul of first 10 numbers
6.  Array - sum/mul of num
7.  Array -  which even & odd
**/