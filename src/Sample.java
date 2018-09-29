import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		char[20] str =new char('arunkumar');
		
		int n=str.length;
		for(int i=0;str[i]!='\0';i++){
			if(i%2==0){
				System.out.println(str[i]);
			}
			
		}

	
	}
}