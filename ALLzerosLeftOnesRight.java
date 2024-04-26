package Practicebasic;


public class ALLzerosLeftOnesRight {
    public static void moveZeros(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // Move right pointer to the next non-zero element
            while (left < right && nums[right] != 0) {  
                right--;
            }

            // Move left pointer to the next zero element
            while (left < right && nums[left] == 0) {
                left++;
            }

            // Swap the elements at left and right pointers
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 6, 1, 0, 1};
        moveZeros(nums);
        System.out.println("Output: " + java.util.Arrays.toString(nums));
    }
}