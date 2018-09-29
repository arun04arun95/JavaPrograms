import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("\nEnter the number of rows : ");
        int r = input.nextInt();
        char c= '*';
        for(int i=0;i<r;i++)
        {
            for(int k=r;k>i;k--)
            {
                System.out.print("A");
            }
            
            for(int j=0;j<=i;j++)
            {
                  System.out.print(c+" ");
            }
            System.out.println();
        }

	}

}
