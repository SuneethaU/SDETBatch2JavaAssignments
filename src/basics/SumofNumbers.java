package basics;

public class SumofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Sum=0;
		int m=1;
		for(int i=1;i<=10;i++) {
			Sum=Sum+i;
		}
		System.out.println("Sum of 10 numbers is "+Sum);
		for(int j=1;j<=10;j++) {
			m=m*j;
		}
		System.out.println("Mul of 10 numbers is "+m);
	}

}
