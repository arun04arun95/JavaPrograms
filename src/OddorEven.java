import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner input= new Scanner(System.in);
		System.out.println(" Enter the number you want to find odd or even: ");
		number=input.nextInt();
		if(number%2==0){
			System.out.println("The given number is even");
		}else{
			System.out.println("The given number is ");
		}
		

	}

}
