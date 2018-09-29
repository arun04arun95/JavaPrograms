
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=1,z,count=10;
		System.out.print(" "+x+ " "+y);
		for (int i=2;i<count;i++){
			z=x+y;
			x=y;
			y=z;
			System.out.print(" "+z);
		}

	}

}
