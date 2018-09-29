import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,remainder,sum=0;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the three digit number:");
		number=input.nextInt();
		
		while(number>0){
			remainder=number%10;
			sum=sum*10+remainder;
			number=number/10;
			
		}
		System.out.println("The reverse of given number : "+sum);

	}

}
