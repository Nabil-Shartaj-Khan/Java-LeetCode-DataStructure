package LeetCode;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        RemoveDuplicate rd = new RemoveDuplicate();

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = rd.removeDuplicates(nums);
        // Print the result
        System.out.println("The length of the array after removing duplicates: " + length);
        System.out.println("The array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, length)));

    }

    public int removeDuplicates(int[] nums) {
        int unique=1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]!=nums[i-1]) {
                unique+=1;
                nums[unique-1]=nums[i];
            }
        }
        return unique;
    }

}
