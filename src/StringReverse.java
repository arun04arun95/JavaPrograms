
public class StringReverse {

	public static void main(String[] args) {
		String str="Arun kumar";
		String str1="";
		int n = str.length();
		System.out.println(str);
		System.out.println(n);
		int temp= n-1;
		while(temp>=0){
			str1 = str1 + str.charAt(temp);
			
			temp--;
		}
		
		System.out.println(str1);
		
	}

}
