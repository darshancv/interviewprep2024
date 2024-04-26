package Practicebasic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc =new Scanner(System.in);
		
		String s= sc.nextLine();
		String result="";
		for(int i=s.length()-1;i>=0;i--) {
			
			result=result + s.charAt(i);
		}
		
		
		
		System.out.println(result);
	}

}
