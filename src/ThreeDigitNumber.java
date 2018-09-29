import java.util.Scanner;

public class ThreeDigitNumber {

	public static void main(String[] args) {
		int number,remainder,sum=0;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the three digit number:");
		number=input.nextInt();
		
		while(number>0){
			remainder=number%10;
			sum=sum+remainder;
			number=number/10;
			
		}
		System.out.println("The sum of given number : "+sum);
		

	}

}
