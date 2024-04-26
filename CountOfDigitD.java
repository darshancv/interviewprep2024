package Practicebasic;

import java.util.Scanner;

public class CountOfDigitD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Eneter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("Eneter the digit: ");

		int d = sc.nextInt();

		int count = calculateDigitCount(n, d);
		System.out.println("count :" + count);

	}

	private static int calculateDigitCount(int n, int d) {
		int count = 0;
		while (n != 0) {
			int digit = n % 10;
			if (digit == d) {
				count++;
			}
			n=n/10;
		}

		return count;
	}

}
