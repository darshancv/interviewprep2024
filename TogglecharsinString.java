package Practicebasic;

import java.util.Scanner;

public class TogglecharsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String : ");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch= s.charAt(i);
			if(ch >= 'A' && ch <='Z') {
				res=res + (char)(ch + 32) ;
			}
			else if(ch >= 'a' && ch <='z') {
				res = res + (char)(ch-32);;
			}
		}
		
		System.out.println("Result :" + res);
		
	}

}
