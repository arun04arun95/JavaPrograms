import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number to find factorial: ");
		int fact=1,number=input.nextInt();
		for(int i=1;i<=number;i++){
			fact=fact*i;
		}
		System.out.println("Factorial of given number : "+fact);
		

	}

}
