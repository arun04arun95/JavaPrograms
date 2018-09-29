import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int i;
		System.out.println("Enter the number of Elements: ");
		i=input.nextInt();
		int[] a= new int[20];
		System.out.println("Enter the " +(i)+" element :");
		for (int j=0;j<i;j++){
			a[j]=input.nextInt();
		}
		System.out.print("Before Bubble Sort :");
		for (int j=0;j<i;j++){
			System.out.print(" "+a[j]);
			
		}
		int temp=0;
		for (int j=0;j<i;j++){
			for(int k=1;k<i-j;k++){
			   if(a[k-1]>a[k]){
				temp=a[k-1];
				a[k-1]=a[k];
				a[k]=temp;	
			   }
			}
		}
		System.out.print("After Bubble Sort : " );
		for (int j=0;j<i;j++){
			System.out.print(" "+a[j]);
			
		}

	}

}
