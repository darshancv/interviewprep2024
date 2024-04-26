package Practicebasic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number: ");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int temp=1;
		while(n!=0) {
			
			temp= temp * n;
			n--;
			
		}
		
		System.out.println(temp);
		
		
	}

}
