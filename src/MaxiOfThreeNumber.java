import java.util.Scanner;

public class MaxiOfThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the three number to find maximum of amoung them");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		if ((a>b)&&(a>c)){
			System.out.println(" A is greater" +a);
		}else if (b>c){
			System.out.println(" B is greater" +b);
			}else{
				System.out.println(+c+"  is greater" );
			}

	}

}
