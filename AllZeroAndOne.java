package Practicebasic;

import java.util.Arrays;

public class AllZeroAndOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 0, 1, 0, 0, 1, 0, 1 };

		// Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {

		
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;

				}

			}
		}

		for (Integer i : nums)
			System.out.println(i);

	}

}
