import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		
		String[] stud = new String[3];
		int [] rollnumber =new int[3];
		int [] marks =new int[3];
		double  total, average;
		int i,j;
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the three Student Name and Roll Number ");
		for( i=0;i<3;i++){
			System.out.println("Enter the  Student Name  :");
			String name=in.next();
			stud[i]=name;
			System.out.println("Enter the  Roll Number :");
			int roll=in.nextInt();
			rollnumber[i]=roll;
			for(j=0;j<3;j++){
				System.out.println("Enter the marks of three subject: ");
				int mark=in.nextInt();
				marks[i]=mark;
				
			}
		}
		for( i=0;i<3;i++){
			System.out.println(" Student name "+stud[i]);
			System.out.println(" Roll number "+rollnumber[i]);
			for(j=0;j<3;j++){
				System.out.println(" Each student marks "+marks[j]);
			}
		}
	}

}
