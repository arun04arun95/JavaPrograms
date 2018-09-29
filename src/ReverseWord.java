import java.util.*;
class ReverseWord{

    public static void main(String[] args){

    		String s;
    		String rev="";
    		String temp=" ";
    		Scanner ob=new Scanner(System.in);
    		System.out.println(" enter String");
    		s=ob.nextLine();
    		for(int i=s.length()-1;i>=0;i--)
    			rev=rev+s.charAt(i);
    		System.out.println(rev);
    		String[] a=rev.split(" ");
    		int j=a.length-1;
    		while(j>=0){
    			temp=temp+a[j];
    			temp=temp+" ";
    			j--;

    		}
    		System.out.println(temp);
    }
}
