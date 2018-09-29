import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		String str1="";
		int n = str.length();
		System.out.println(str);
		System.out.println(n);
		int temp= n-1;
		while(temp>=0){
			str1 = str1 + str.charAt(temp);
			temp--;
		}
		if (str.equals(str1)){
			System.out.println("The given String is palindrome: "+str);
		}else{
			System.out.println("No palindrome: "+str1);
		}

	}

}
