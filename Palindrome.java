package Practicebasic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		Boolean res = isPali(n);
		System.out.println(res);
		
		
		
	}

	private static Boolean isPali(int n) {

		int temp = n,sum =0;
		
		while(temp !=0) {
			int digit = temp % 10;
			sum =(sum * 10) + digit;
			temp=temp/10;
			
		}
		
		System.out.println(sum);
		if(sum==n) {
			return true;
		}
		
		
		return false;
	}

}
