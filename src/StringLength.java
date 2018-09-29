
public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Arun kumar";
		System.out.println(" Length of the String: ");
		int length=0;
		for(char c : str.toCharArray()){
			length++;
		}
		System.out.println(" Length = "+length);
	}

}
