package LeetCode;

import java.util.Arrays;
import java.util.List;

public class PairCountLessTarget {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5); // Example list of integers
        int target = 7; // Example target sum
        int result = countPairs(nums, target);
        System.out.println(result);

    }
    public static int countPairs(List<Integer> nums, int target){
        int res=0;
        nums.sort((a,b)->a-b); //ascending sort
        int left=0;
        int right=nums.size()-1;

        while(left!=right){
            if(nums.get(left)+nums.get(right)<target){
                    res+=right-left;
                    left++;
            }else{
                right--;
            }
        }
        return res;



    }
}
