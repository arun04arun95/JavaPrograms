import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner input=new Scanner(System.in);
		System.out.println(" Enter the number to print Multiplication Table: ");
		number=input.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(+number+"*" +i+"="+(number*i));
		}
		
		

	}

}
