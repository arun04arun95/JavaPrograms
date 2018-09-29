import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number,rem,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println(" Enter the number to check Armstrong Number");
		number=input.nextInt();
		int temp=number;
		 while(number >0){
			 rem=number%10;
			 number=number/10;
			 sum=sum+rem*rem*rem;
		 }
		 if (temp==sum){
			 System.out.println("The given number is Armstrong number");
		 }else{
			 System.out.println("The given number is not Armstrong number");
		 }
		 
	}

}
