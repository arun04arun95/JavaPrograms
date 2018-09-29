import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,remainder,sum=0;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the three digit number:");
		number=input.nextInt();
		int temp=number;
		while(number>0){
			remainder=number%10;
			sum=sum*10+remainder;
			number=number/10;
			
		}
		if (temp==sum){
			System.out.println("Palindrome"+temp);
		}else{
			System.out.println("Not Palindrome : "+sum);
		}
		

	}

}
