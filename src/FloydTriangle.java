import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int number=1;
		System.out.println("Enter the number of rows to print Floyd's Triangle :");
		int rows=input.nextInt();
		for ( int a = 1 ; a <= rows ; a++ ) {
			for ( int b = 1 ; b <= a ; b++ ) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}

	}

}
