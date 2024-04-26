package Practicebasic;

import java.util.Scanner;

public class DigitsInNUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		
		int num =sc.nextInt();
		int res=0;
		while(num !=0)
		{
			num=num/10;
			res++;
		}
		
		System.out.println(res);
	}

}
