package LeetCode;

import java.util.Arrays;

public class SortedArrayInputSum {
    public static void main(String[] args) {

        SortedArrayInputSum solution = new SortedArrayInputSum();

        // Define a sorted array and a target sum
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method and store the result
        int[] result = solution.twoSum(nums, target);

        // Print the result
        if (result != null) {
            System.out.println("Indices of the two numbers that add up to the target are: " + Arrays.toString(result));
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]<target){
                i++;
            }
            else if(nums[i]+nums[j]>target){
                j--;
            }
            else{
                return new int[]{i+1,j+1};
            }
        }

        return null;

    }
}
