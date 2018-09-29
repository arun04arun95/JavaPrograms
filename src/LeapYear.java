import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the year to check leap year:");
		year=input.nextInt();
		
		if ((year%400==0) || (year%4==0) && (year%100!= 0)){
			System.out.println("The given is"+year +" leap year");
		}else{
			System.out.println("Ordinary year");
		}
		

	}

}
